import java.util.Scanner;

public class UsHesabiYapma {
    public static void main(String[] args) {

        int tabanSayi,usSayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı tabanını giriniz:");
        tabanSayi = scanner.nextInt();

        System.out.println("Sayı Üssünü Giriniz:");
        usSayi = scanner.nextInt();

        System.out.println(UsBul(tabanSayi, usSayi));


    }
    static int UsBul (int tabanSayi , int usSayi) {

        if (tabanSayi==1||usSayi==0){

            return 1;
        }else {

            return tabanSayi*=UsBul(tabanSayi,usSayi-1);
        }


    }
}
