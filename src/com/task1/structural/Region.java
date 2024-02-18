package com.task1.structural;

public class Region extends Place {
    private static int regionId = 0;

    private City[] cities;

    public Region(String name, City[] cities) {
        super(name);
        setCities(cities);
        regionId++;
    }

    public static int getRegionId() {
        return regionId;
    }

    private void setSquare() {
        double allArea = 0;
        for (City city : this.cities) {
            allArea += city.getSquare();
        }
        super.setSquare(allArea);
    }

    @Override
    public String toString() {
        return "Район " + getName() + " (" + getSquare() + " кв. м.; " + getCities().length + " города (ов)";
    }

    @Override
    public int hexCode() {
        int citiesSum = 0;
        for (City city : cities) {
            citiesSum += city.hexCode();
        }
        return citiesSum + cities.length;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
        setSquare();
    }
}
