package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /*
               Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
               Verilen tamsayılar veya toplamın 10'dan fazla hanesi varsa, "taşma" yazdırın.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();
        System.out.println("Lutfen ikinci sayiyi  giriniz");
        double sayi2= input.nextDouble();


        if ((sayi1+sayi2)>1000000000){
            System.out.println("Tasma");
        } else if (sayi1+sayi2>=0) {
            System.out.println(sayi1+sayi2);
        }


    }
}
