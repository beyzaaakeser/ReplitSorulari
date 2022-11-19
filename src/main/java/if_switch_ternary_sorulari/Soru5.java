package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        /*
            Bir aydaki gün sayısını bulan bir Java programı yazınız.(Switch Case Kullanınız) (Mülakat Sorusu / Kaçak Yıl)


            Artik yil = 100e bolunenlerden 400e bolunenler
                        100e bolunmeyenlerden 4 e bolunenler.

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay sayisini giriniz.");
        byte ay = input.nextByte();
        System.out.println("Lutfen yil sayisini giriniz ");
        int yil = input.nextInt();


        switch (ay){

            case 1:
                System.out.println("Ocak "+yil+" yilinda 31 gun var");
                break;
            case 2:
               String leap = yil%100==0 ?  (yil%400==0? "Artik Yil" : "Artik yil degil")  : (yil%4==0 ? "Artik Yil" : "Artik yil degil");
               if (leap.equals("Artik Yil")){
                   System.out.println("Subat "+ yil+ " yilinda 29 gun var");
               }else System.out.println("Subat "+ yil+ " yilinda 28 gun var");
               break;
            case 3:
                System.out.println("Mart "+yil+" yilinda 31 gun var");
                break;
            case 4:
                System.out.println("Nisan "+yil+" yilinda 30 gun var");
                break;
            case 5:
                System.out.println("Mayis "+yil+" yilinda 31 gun var");
                break;
                case 6:
                System.out.println("Haziran "+yil+" yilinda 30 gun var");
                break;
                case 7:
                System.out.println("Temmuz "+yil+" yilinda 31 gun var");
                break;
                case 8:
                System.out.println("Agustos "+yil+" yilinda 31 gun var");
                break;
                case 9:
                System.out.println("Eylul "+yil+" yilinda 30 gun var");
                break;
                case 10:
                System.out.println("Ekim "+yil+" yilinda 31 gun var");
                break;
            case 11:
                System.out.println("Kasim "+yil+" yilinda 30 gun var");
                break;
            case 12:
                System.out.println("Aralik "+yil+" yilinda 31 gun var");
                break;






        }

































































    }
}
