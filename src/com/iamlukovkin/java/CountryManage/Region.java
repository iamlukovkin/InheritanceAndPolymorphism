package com.iamlukovkin.java.CountryManage;

public class Region extends Place {
    private boolean isAreaCenter;
    private City regionCenter;
    public Region(String name, float square, City regionCenter, boolean areaCenter) {
        super(name, square);
        setRegionCenter(regionCenter);
        setAreaCenter(areaCenter);
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + regionCenter.hashCode();
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

    @Override
    public String toString() {
        return getName() + ", площадь " + getSquare() + " кв.км., центр " + getRegionCenter().toString();
    }

    public boolean isAreaCenter() {
        return isAreaCenter;
    }

    public void setAreaCenter(boolean areaCenter) {
        isAreaCenter = areaCenter;
    }
}
