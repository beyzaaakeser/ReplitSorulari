package loop_sorulari;

import java.util.Scanner;

public class For_While_1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = input.nextLine();
        System.out.println("Lutfen bir karakter giriniz.");
        char karakter = input.next().toLowerCase().charAt(0);

        int sayac = 0;
                            //12
        for (int i = 0 ; i<isim.length(); i++){

            if (isim.charAt(i)==karakter){
                sayac++;
            }

        }
        System.out.print(sayac);














































    }
}
