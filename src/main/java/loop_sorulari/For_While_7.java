package loop_sorulari;

import java.util.Scanner;

public class For_While_7 {
    public static void main(String[] args) {

        // Numaranın Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        // * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Java Mükemmel Sayısı olabilir.
        // 15 ==> 15 haric bolenleri == 1 3 5 ==9   ==> mukemmel sayi degil.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        int sum = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                if (i!=sayi ){
                    sum = sum +i;

                }else if (sum==sayi){
                    System.out.println("Mukemmel sayi");
                }else System.out.println("Mukemmel sayi degil!");

            }



            
        }
        
        


















































    }
}
