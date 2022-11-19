package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {


        // Kullanıcıdan bir dize isteyin ve son 2 harfin 3 kopyasından oluşan yeni bir dize yazdırın
        // Mustafa ==> fafafa


//
//        String bolunmus = dize.substring(dize.length()-2,dize.length());
//
//        String son = bolunmus.concat(bolunmus).concat(bolunmus);
//        String son2  =bolunmus.repeat(3);
//        System.out.println(son);
//        System.out.println(son2);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir dize giriniz");
        String dize = input.next();
        System.out.println("Lutfen kac kere tekrarlamak istediginizi giriniz. ");
        int tekrar = input.nextInt();

        String bolunmus = dize.substring(dize.length()-2,dize.length());

        String cikti = "";

        for (int i = 0; i < tekrar ; i++) {
            cikti = cikti + bolunmus;
        }
        System.out.println(cikti);




































    }
}
