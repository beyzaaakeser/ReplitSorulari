package array_sorulari;

import java.util.Arrays;

public class ArrayTrSoru1 {
    public static void main(String[] args) {

        /*
                Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
                not: Test datadaki değerleri kullanınız.
                Test Data:
                [1232, 1134,2345,1022]
                [Java, Python, PHP, C#, C Programming, C++]
`               Beklenen Çıktı:
                [1022,1134,1232,2345]
                [C Programming, C#, C++, Java, PHP, Python]
         */

        int sayi[]= {1232, 1134,2345,1022};
        String kelime[]= {"Java","Python","PHP","C#","C Programming", "C++"};

        Arrays.sort(sayi);
        Arrays.sort(kelime);
        System.out.println(Arrays.toString(kelime));
        System.out.println(Arrays.toString(sayi));















































    }
}
