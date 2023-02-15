import java.util.Scanner;

public class GirilenSayiMinMaxHesaplama {
    public static void main(String[] args) {
        int kacSayi;
        int girilenSayi;
        int min = 2147483647, max = -2147483648;

        System.out.println("Kaç sayı girmek istiyorsunuz");
        Scanner scanner = new Scanner(System.in);
        kacSayi = scanner.nextInt();

        for(int i=1 ; i<= kacSayi;i++){

            System.out.println(i +".Sayı Giriniz");

            girilenSayi = scanner.nextInt();

            if(girilenSayi > max){

                max = girilenSayi;
            }else if(girilenSayi < min){

                min = girilenSayi;
            }
        }

        System.out.print("Maximum Sayı: " + max + "\nMinimum Sayı: " + min);
    }

}
