package loop_sorulari;

import java.util.Scanner;

public class For_While_9 {
    public static void main(String[] args) {

        // Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = input.nextInt();

            String str ="";
         int yeniSayi = 0;

        for (int i = 0; i <=sayi ; i++) {

             yeniSayi= sayi%10;
            System.out.print(yeniSayi);
            str= ""+str+yeniSayi;
            sayi=sayi/10;

        }
        System.out.println();
        System.out.println(str);















































    }
}
