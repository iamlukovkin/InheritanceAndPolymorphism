package com.task1;

import com.task1.creational.StatementFactory;
import com.task1.structural.Country;

public class Main {
    public static void main(String[] args) {
        StatementFactory statementFactory = StatementFactory.getInstance();
        Country russia = statementFactory.makeCountry("Москва","Россия");

        System.out.println(russia);
        russia.displayCapital();
        russia.displayAreasCount();
        russia.displayAreaCentres();
    }
}