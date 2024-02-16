package com.task1.Statement;

public class Area extends Place {
    private static int areaId = 0;
    private Region mainRegion;
    private Region[] includedRegions;

    public Area(String name, Region mainRegion, Region[] includedRegions) {
        super(name);
        setMainRegion(mainRegion);
        setIncludedRegions(includedRegions);
        areaId++;
    }

    public static int getAreaId() {
        return areaId;
    }

    public Region getMainRegion() {
        return this.mainRegion;
    }

    public void setMainRegion(Region mainRegion) {
        this.mainRegion = mainRegion;
    }

    @Override
    public String toString() {
        return getName() + " область (" + getSquare() + " кв. м.; " + getIncludedRegions().length + " регионов; главный - " + getMainRegion().toString();
    }

    @Override
    public int hexCode() {
        int allSum = 0;
        for (Region region : includedRegions) {
            allSum += region.hexCode();
        }
        return allSum;
    }

    public Region[] getIncludedRegions() {
        return includedRegions;
    }

    public void setIncludedRegions(Region[] includedRegions) {
        this.includedRegions = includedRegions;
        setArea();
    }

    private void setArea() {
        double allArea = 0;
        for (Region region : includedRegions) {
            allArea += region.getSquare();
        }
        super.setSquare(allArea);
    }

    public void displayAreaCenter() {
        System.out.println(getName() + " область - " + getMainRegion().toString());
    }
}
