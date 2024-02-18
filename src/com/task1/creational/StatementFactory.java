package com.task1.creational;

import java.util.random.RandomGenerator;

import com.task1.structural.Area;
import com.task1.structural.City;
import com.task1.structural.Country;
import com.task1.structural.Region;

public class StatementFactory {
    private static StatementFactory uniqueInstance;

    public static StatementFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StatementFactory();
        }
        return uniqueInstance;
    }

    public City makeCity(String name, double square) {
        return new City(name, square);
    }

    public Region makeRegion(String name, int count) {
        City[] cities = new City[count];
        for (int i = 1; i <= count; i++) {
            cities[i - 1] = makeCity("Город " + City.getCityId(), RandomGenerator.getDefault().nextDouble((10 * count), (100 * count)));
        }
        return new Region(name, cities);
    }

    public Area makeArea(String name, int regionsCount) {
        Region[] regions = new Region[regionsCount];
        for (int i = 1; i <= regionsCount; i++) {
            regions[i - 1] = makeRegion("№" + Region.getRegionId() + 1, RandomGenerator.getDefault().nextInt(1, 10));
        }
        return new Area(name, regions[RandomGenerator.getDefault().nextInt(0, regions.length)], regions);
    }

    public Area[] makeAreas(int count) {
        Area[] areas = new Area[count];
        for (int i = 0; i < count; i++) {
            areas[i] = makeArea((Area.getAreaId() + 1) + "-ая", RandomGenerator.getDefault().nextInt(1, count));
        }
        return areas;
    }

    public Country makeCountry(String capitalName, String countryName) {
        City countryCapital = makeCity(capitalName, 100);
        Area[] countryAreas = makeAreas(10);
        return new Country(countryName, countryCapital, countryAreas);
    }
}
