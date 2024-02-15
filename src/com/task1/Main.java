package com.task1;

import com.task1.Patterns.StatementFactory;
import com.task1.Statement.Area;
import com.task1.Statement.Country;
import com.task1.Statement.Region;

public class Main {
    public static void main(String[] args) {
        StatementFactory statementFactory = StatementFactory.getInstance();
        Country russia = statementFactory.makeCountry("Россия");

        System.out.println(russia);
        System.out.println("Столица: \n" + russia.getCapital());
        System.out.println("Число областей: " + russia.getAreasCount());
        System.out.println("Областные центры: ");
        for (Area area : russia.getAreas()) {
            Region areaCenter = area.getMainRegion();
            System.out.println(area.getName() + " область - " + areaCenter.toString());
        }
    }
}