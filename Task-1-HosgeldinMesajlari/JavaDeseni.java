public class Main{
  public static void main(String[] args){
    System.out.println("    J A V V A   ");
    System.out.println("  J A A V V A A   ");
    System.out.println("J J AAAAA V V AAAAA");
    System.out.println("  J J A A V A A    ");
  }
}

// baska bir daha kolay bir sekilde yazabiliriz //
public class Main {
    public static void main(String[] args) {
        String[] javaLogo = {
            "    J A V V A   ",
            "  J A A V V A A   ",
            "J J AAAAA V V AAAAA",
            "  J J A A V A A    "
        };
        for (String line : javaLogo) {
            System.out.println(line);
        }
    }
}
