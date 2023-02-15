import java.util.Arrays;
import java.util.Scanner;

public class DiziElamanSiralama {
    public static void main(String[] args) {

        int diziBoyutu;
        int diziElamanlari;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz:");
        diziBoyutu = scanner.nextInt();

        int[] list = new int [diziBoyutu];

        for (int i =0 ; i < list.length; i++){

            System.out.print(i+1 +".Elemanı Giriniz:");
            diziElamanlari = scanner.nextInt();

            list[i] = diziElamanlari;

        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


    }
}
