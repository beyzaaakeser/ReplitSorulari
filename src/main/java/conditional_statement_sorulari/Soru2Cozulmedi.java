package conditional_statement_sorulari;

import java.util.Scanner;

public class Soru2Cozulmedi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();


        if (sayi1>sayi2){
            System.out.println(sayi1 + " buyuktur " + sayi2 );
        } else if (sayi1<=sayi2) {
            System.out.println(sayi1);
        }


    }
}
