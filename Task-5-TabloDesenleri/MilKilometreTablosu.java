//very basic way //
public class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("Mil → Kilometre Tablosu");
        System.out.println("-----------------------");
        System.out.println("1 mil  = " + (1 * 1.609) + " km");
        System.out.println("5 mil  = " + (5 * 1.609) + " km");
        System.out.println("10 mil = " + (10 * 1.609) + " km");
        System.out.println("20 mil = " + (20 * 1.609) + " km");
        System.out.println("50 mil = " + (50 * 1.609) + " km");
    }
}
 // more profitional way//
public class MilKilometreTablosu {
    public static void main(String[] args) {
        double oran = 1.609; 
        int[] mil = {1, 5, 10, 20, 50}; 
        System.out.println("Mil → Kilometre Tablosu");
        System.out.println("-----------------------");

        for (int i = 0; i < mil.length; i++) {
            double km = mil[i] * oran;
            System.out.println(mil[i] + " mil = " + km + " km");
        }
    }
}
