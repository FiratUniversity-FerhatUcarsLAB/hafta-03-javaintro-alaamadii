public class ParaBozma {
    public static void main(String[] args) {
        int toplam = 278; 
        int[] paralar = {100, 50, 20, 10, 5, 2, 1}; 
        int[] adet = new int[paralar.length]; 

        int kalan = toplam;

        for (int i = 0; i < paralar.length; i++) {
            adet[i] = kalan / paralar[i]; 
            kalan = kalan % paralar[i];   
        }

        System.out.println(toplam + " TL = ");
        for (int i = 0; i < paralar.length; i++) {
            if (adet[i] > 0) {
                System.out.println(adet[i] + " x " + paralar[i]);
            }
        }
    }
}

// making it with println manually//
public class ParaBozma {
    public static void main(String[] args) {
        int toplam = 278; 

        
        int yuzluk = toplam / 100; 
        int kalan = toplam % 100; 

        int ellilik = kalan / 50; 
        kalan = kalan % 50;        

        int yirmilik = kalan / 20;
        kalan = kalan % 20;        

        int onluk = kalan / 10;    
        kalan = kalan % 10;       

        int beslik = kalan / 5;  
        kalan = kalan % 5;        

        int ikilik = kalan / 2;   
        kalan = kalan % 2;         

        int birlik = kalan;        
      
        System.out.println(toplam + " TL =");
        System.out.println(yuzluk + " x 100");
        System.out.println(ellilik + " x 50");
        System.out.println(yirmilik + " x 20");
        System.out.println(onluk + " x 10");
        System.out.println(beslik + " x 5");
        System.out.println(ikilik + " x 2");
        System.out.println(birlik + " x 1");
    }
}

