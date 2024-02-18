package com.task1.structural;


public class Country extends Place {
    private City capital;
    private Area[] areas;

    public Country(String name, City capital, Area[] areas) {
        super(name);
        setCapital(capital);
        setAreas(areas);
    }

    @Override
    public String toString() {
        return "Государство " + getName() + " площадь: " + getSquare() + " кв. м.";
    }

    @Override
    public int hexCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public City getCapital() {
        return capital;
    }

    public void displayCapital() {
        System.out.println("Столица: \n" + getCapital());
    }

    public int getAreasCount() {
        return getAreas().length;
    }

    public void displayAreasCount() {
        System.out.println("Количество областей: " + getAreasCount());
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
        setSquare();
    }

    private void setSquare() {
        double fullSquare = 0;
        for (Area area : areas) {
            fullSquare += area.getSquare();
        }
        super.setSquare(fullSquare);
    }

    public void displayAreaCentres() {
        System.out.println("Областные центры: ");
        for (Area area : areas) {
            area.displayAreaCenter();
        }
    }
}
