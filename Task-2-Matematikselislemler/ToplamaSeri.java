// doning this using println //
public class Calculate{
  public static void main(String[] args){
    int toplam = 1+2+3+4+5+6+7+8+9;
    System.out.println("toplam =" + toplam);
  }
}

// daha kolay bir sekilde yapabilirim//
public class Calculate{
  public static void main(String[] args){
    int result = 0
    for(int i = 1; i <= 9; i++){
      int result += i
      System.out.println("toplam = "+ result);
