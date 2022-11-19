package array_sorulari;

public class ArrayTrSoru5 {
    public static void main(String[] args) {

        /*
                yazılan değerin array içerisinde arayan Java Kodu yazınız.
                Array: [1551,1223,1443,1267,1789,1023,2020]
                Aranan Değer:2020
                Beklenen Çıktı:**True**
                Aranan Değer:2010
                Beklenen Çıktı :**False**


         */

        int aranan = 2025;

        int sayi[]={1551,1223,1443,1267,1789,1023,2020};
        int sayac = 0;

        for (int w: sayi) {

            if (w == aranan) {
                sayac++;
                System.out.println("**True**");
            }
        }
        if (sayac==0){
            System.out.println("**False**");
        }































    }
}
