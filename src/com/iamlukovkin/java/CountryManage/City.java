package com.iamlukovkin.java.CountryManage;

public class City extends Place {
    public City(String name, float square) {
        super(name, square);
    }

    @Override
    public String toString() {
        return getName() + ", площадь " + getSquare() + " кв.км.";
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return super.equals(obj);
    }

}
