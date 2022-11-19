package array_sorulari;

public class ArrayTrSoru3 {
    public static void main(String[] args) {

        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        Array =  [20, 30, 25, 35, -16, 60, -100 ]
        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
         */

        int sum = 0;
        int ort = 0;
        int sayi[] = {20, 30, 25, 35, -16, 60, -100};

        for (int w: sayi){
            sum = sum+w;
        }
        System.out.println(sum);
        System.out.println(sum/ sayi.length);










































    }
}
