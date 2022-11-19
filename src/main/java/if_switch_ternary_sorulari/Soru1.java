package if_switch_ternary_sorulari;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        /*
            Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın
            İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy karesi (m)


            BMI 18,5'in altındaysa zayıfsınız
            BMI 18,5 ile 25 arasında ise kilonuz idealdir
            BMI 25-30 arasındaysa şişmansınız
            BMI 30'dan büyük veya eşitse, obez

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cinsinden giriniz");
        double boy = input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        double indeks = kilo/ (boy*boy);


        if (indeks<18.5){
            System.out.println("Zayifsiniz");
        } else if (indeks>18.5 && indeks<25) {
            System.out.println("Kilonuz idealdir");
        } else if (indeks>25 && indeks<30) {
            System.out.println("Sismansiniz");
        } else if (indeks>= 30) {
            System.out.println("Obezsiniz ammmann dikkat!!!");
        }else System.out.println("Tanimlanmamis aralik");


    }
}
