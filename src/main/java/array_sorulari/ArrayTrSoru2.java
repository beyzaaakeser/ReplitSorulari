package array_sorulari;

public class ArrayTrSoru2 {
    public static void main(String[] args) {

        /*
        Array deki sayıları tolpayan Java kodunu yazınız.
        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Beklenen Çıktı:
        Array toplamı: 55
         */


        int sum = 0;

        int sayi[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int w : sayi){

           sum = sum+w;

        }
        System.out.println(sum);



























    }
}
