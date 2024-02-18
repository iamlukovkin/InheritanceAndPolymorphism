package com.task1.structural;

public class City extends Place {
    private static int cityId = 0;

    public City(String name, double area) {
        super(name);
        setSquare(area);
        cityId++;
    }

    public static int getCityId() {
        return cityId;
    }

    public void setSquare(double area) {
        super.setSquare(area);
    }

    @Override
    public String toString() {
        return "Город " + getName() + " (площадь: " + getSquare() + " кв.м.)";
    }

    @Override
    public int hexCode() {
        return (int) getSquare();
    }
}
