package array_sorulari;

import java.util.Arrays;

public class ArrayEnSoru8 {
    public static void main(String[] args) {



        /*
                2 tamsayı Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazdıran bir dönüş yöntemi yazın.
                Girdi1={1,2,3,4,} Giriş2={5,6} Çıktı={1,2,3,4,5,6}
         */



        int arr[]={1,2,3,4,};
        int brr[]={5,6};


        int crr[]=new int[arr.length+ brr.length];

        int i = 0;

                for (int j = 0; j < arr.length; j++) {

                    crr[i] = arr[j];
                    i++;
                }

                for (int k=0; k < brr.length ; k++) {

                    crr[i]=brr[k];
                    i++;
                }

        System.out.println(Arrays.toString(crr));































    }
}
