public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;       
        int kalanSaniye = toplamSaniye % 3600; 
        int dakika = kalanSaniye / 60;          
        int saniye = kalanSaniye % 60;         
        System.out.println(toplamSaniye + " saniye = " 
                           + saat + ":" 
                           + dakika + ":" 
                           + saniye);
    }
}
// baska bir sekilde yapabilirim//

public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;

        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        System.out.printf("%d saniye = %d:%02d:%02d%n", toplamSaniye, saat, dakika, saniye);
    }
}
