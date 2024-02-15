package com.task1.Statement;

public class City extends Place {
    public City(String name, double area) {
        super(name);
        setSquare(area);
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
