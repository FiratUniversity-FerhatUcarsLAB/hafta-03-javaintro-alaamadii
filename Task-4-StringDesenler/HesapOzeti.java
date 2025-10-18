public class HesapOzeti {
    public static void main(String[] args) {
        String[] urunler = {"Elma", "Ekmek", "Sut"};
        int[] miktarlar = {3, 2, 1};
        double[] fiyatlar = {2.5, 1.5, 4.0};
      
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Ürün", "Miktar", "Fiyat", "Toplam");
        System.out.println("------------------------------------------");

        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktarlar[i] * fiyatlar[i];
            System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", urunler[i], miktarlar[i], fiyatlar[i], toplam);
        }
    }
}


// baska bir cozum//
public class HesapOzeti {
    public static void main(String[] args) {
        String[] urunler = {"Elma", "Ekmek", "Sut"};
        int[] miktarlar = {3, 2, 1};
        double[] fiyatlar = {2.5, 1.5, 4.0};
        System.out.println("Ürün     Miktar   Fiyat   Toplam");
        System.out.println("--------------------------------");

        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktarlar[i] * fiyatlar[i];
            System.out.println(
                urunler[i] + "     " + 
                miktarlar[i] + "       " + 
                fiyatlar[i] + "     " + 
                toplam
            );
        }
    }
}
