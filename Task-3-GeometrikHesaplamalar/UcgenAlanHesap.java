public class UcgenHeron {
    public static void main(String[] args) {
       
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double s = (a + b + c) / 2;

      
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

       
        System.out.println("kenarlar a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(" yarim cevre s = " + s);
        System.out.println("alan  A = " + alan);
    }
}
