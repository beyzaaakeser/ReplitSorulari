package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        /*

        Char değişken yanıtının değerini test eden ve aşağıdaki eylemleri gerçekleştiren bir switch ifadesi yazın:
        yanıt a ise, talebiniz işleniyor mesajı yazdırılır
        yanıt b ise, yine de ilgilendiğiniz için teşekkür ederiz mesajı yazdırılır
        yanıt c ise, mesajın Üzgünüz, şu anda herhangi bir yardım yok yanıtın diğer değeri için yazdırılır, "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
        Tarayıcı nesnesi oluşturun.
        Belirtilen dizindeki char değerini almak için charAt() yöntemini kullanın.

        Örnek:

        -Ekran istemi: "Komut girin:"

        giriş: bir
        -Ekran istemi:
        "Talebiniz işleniyor"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen komut girin... komutlar a , b , c ile girilir. ");
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("Yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");


        }


































    }
}
