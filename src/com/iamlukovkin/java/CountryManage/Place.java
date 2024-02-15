package com.iamlukovkin.java.CountryManage;

public abstract class Place {
    private String name;
    private float square;

    public Place(String name, float square) {
        setName(name);
        setSquare(square);
    }

    public String getName() {
        return name;
    }

    public float getSquare() {
        return square;
    }

    public int hashCode() {
        return name.hashCode() + (int) square;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Place place)) {
            return false;
        }
        return place.getName().equals(getName()) && place.getSquare() == getSquare();
    }
}
