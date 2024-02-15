package com.iamlukovkin.java;
import com.iamlukovkin.java.CountryManage.Area;
import com.iamlukovkin.java.CountryManage.City;
import com.iamlukovkin.java.CountryManage.Place;

public class Country extends Place {
    private City capital;
    private Area[] areas;

    public Country(String name, Area[] areas) {
        super(name, 0);
        setAreas(areas);
        super.setSquare(getSquare());
    }

    @Override
    public float getSquare() {
        float sum = 0f;
        for (Area area : areas) {
            sum += area.getSquare();
        }
        return sum;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public City getCapital() {
        return capital;
    }

    public void displayCapital() {
        System.out.println(capital);
    }
}
