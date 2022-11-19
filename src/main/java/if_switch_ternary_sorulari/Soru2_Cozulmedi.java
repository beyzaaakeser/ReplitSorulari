package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru2_Cozulmedi {
    public static void main(String[] args) {


        /*
             Kullanıcı Adı, Soyadı ve kredi kartı numaralarını sorarak özel forma dönüştürün.
             (Ad ve soyadının baş harfleri büyük olmalıdır)
             Kredi kartı numarasını kontrol ediniz, 16 haneli bir yazı yoksa “Geçersiz kredi kartı numarası” yazılmalıdır.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = input.nextLine().toUpperCase();

        System.out.println("Lutfen soy isminizi giriniz");
        String soyIsim = input.nextLine().toUpperCase();

        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String kart = input.next();


        String isimIlk = isim.substring(0,1);
        String soyIsimIlk = soyIsim.substring(0,1);
        String kartSon = kart.substring(13);
        System.out.println(isimIlk+" "+soyIsimIlk+" "+ kartSon);












































    }
}
