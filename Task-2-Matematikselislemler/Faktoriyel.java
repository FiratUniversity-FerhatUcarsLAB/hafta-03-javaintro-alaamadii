public class Faktoriyal{
  public static void main(String[] args){
    int faktoriyal = 5*4*3*2*1;
      System.out.println(" 5!" + faktoriyal);
  }
}

// we can write it in more profitional way //
public class Faktoriyal{
  public static void main(String[] args){
    int count = 1;
    for (int i = 1; i <= 5; i++){
      count = count*i;
    }
    System.out.println(" 5! = "+ count);
  }
}
