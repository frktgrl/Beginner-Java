import java.util.Scanner;

public class MukemmelSayiHesaplama {
    public static void main(String[] args) {

        int girilenSayi;
        int toplam =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz:");
        girilenSayi = scanner.nextInt();

        for(int i=1 ; i <girilenSayi ;i++){

            if(girilenSayi % i == 0){

                toplam = i + toplam;

            }


        }
        if(toplam == girilenSayi){
            System.out.println(girilenSayi + " Mükemmel Sayıdır");
        }else {

            System.out.println(girilenSayi + " Mükemmel Sayı Degildir");

        }
    }
}
