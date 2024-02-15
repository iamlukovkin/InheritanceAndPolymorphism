package com.iamlukovkin.java;

import com.iamlukovkin.java.CountryManage.Area;

public class Main {
    public static void main(String[] args) {
        Country country = new Country(
        "Россия",
        new Area[]{
            new Area(
                "Санкт-Петербург",
                new Region[]{
                    new Region(
                        "Северо-Запад",
                    )
                }
            )
        });
    }
}