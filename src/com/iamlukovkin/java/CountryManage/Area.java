package com.iamlukovkin.java.CountryManage;

public class Area extends Place {
    private Region[] regions;

    public Area(String name, Region[] regions) {
        super(name, 0);
        setRegions(regions);
        super.setSquare(getSquare());
    }

    @Override
    public float getSquare() {
        float sum = super.getSquare();
        for (Region region : regions) {
            sum += region.getSquare();
        }
        return sum;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        for (Region region : regions) {
            hash += region.hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Area area)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        for (int i = 0; i < regions.length; i++) {
            if (!regions[i].equals(area.regions[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String answer = super.toString();
        for (Region region : regions) {
            if (region.isAreaCenter()) {
                answer += ", центр " + region.getName();
                break;
            }
        }
        return answer;
    }
}
