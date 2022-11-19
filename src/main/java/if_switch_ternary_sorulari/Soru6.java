package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {


        /*
                Kullanıcıdan bir ad yazmasını isteyin, adının uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
                Dize aynı karakterlere sahipse Yazdır “Dize çift karakterler içeriyor” Başka Yazdır “Dizenin benzersiz karakterleri var” Lütfen üçlü kullanın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz isim 3 harfli olmalidir");
        String isim = input.next().toLowerCase();

        char harf = isim.charAt(0);
        char ikinciHarf = isim.charAt(1);
        char ucuncuHarf = isim.charAt(2);

        String sonuc = isim.length()<4 && isim.length()>0 ?
                (isim.indexOf(harf)!=isim.lastIndexOf(harf) ||
                isim.indexOf(ikinciHarf)!= isim.lastIndexOf(ikinciHarf) ||
                isim.indexOf(ucuncuHarf)!= isim.lastIndexOf(ucuncuHarf) )? "Isim yinelenen harf iceriyor" : ("Isim yinelenen harf icermiyor")
                : ("Lutfen gecerli isim giriniz");
        System.out.println(sonuc);









































    }
}
