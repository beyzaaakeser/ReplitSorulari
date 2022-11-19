package array_sorulari;

public class ArrayTrSoru6 {
    public static void main(String[] args) {


        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        Array: [12,15,43,23,56,76,78,90,77,43]
        Aranan değer:56
        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı

         */

        int arr[]={12,15,43,23,56,76,78,90,77,43};

        int sayi = 56;
        int counter = 0;

        for(int w : arr) {

            if (w != sayi) {
                counter++;
            } else  {
             break;
            }

        }
        System.out.println(sayi+ " sayisi Arrayin "+(counter+1)+". elemani");




























    }
}
