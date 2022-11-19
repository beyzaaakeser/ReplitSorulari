package loop_sorulari;

public class For_While_5 {
    public static void main(String[] args) {

        // 20'den 0'a kadar çift sayıları yazdırın, ancak azaltma (i--) kullanmayın. ÇIKTI : 20'den 0'a kadar olan çift sayılar: 20 18 16 14 12 10 8 6 4 2 0

        int sayi = 20;

        for (int i = 0; i <21 ; i++) {

            if (sayi>=0 && sayi%2==0){
                System.out.print(sayi+ " ");
                    sayi= sayi-2;

            }

        }
































    }
}
