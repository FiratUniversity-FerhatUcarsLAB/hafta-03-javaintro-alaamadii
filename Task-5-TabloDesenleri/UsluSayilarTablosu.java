public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("a  a^2  a^3");
        System.out.println("-------------");

        System.out.println("1  " + (1*1) + "   " + (1*1*1));
        System.out.println("2  " + (2*2) + "   " + (2*2*2));
        System.out.println("3  " + (3*3) + "   " + (3*3*3));
        System.out.println("4  " + (4*4) + "   " + (4*4*4));
        System.out.println("5  " + (5*5) + "   " + (5*5*5));
    }
}
// profitionl way to do it using for loop//
public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.printf("%-3s %-4s %-4s%n", "a", "a^2", "a^3");
        System.out.println("----------------");

        for (int a = 1; a <= 5; a++) {
            int karesi = a * a;
            int kupu = a * a * a;
            System.out.printf("%-3d %-4d %-4d%n", a, karesi, kupu);
        }
    }
}

