import Patterns.StatementFactory;
import Statement.Area;
import Statement.Country;
import Statement.Region;

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