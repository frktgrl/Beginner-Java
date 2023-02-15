import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        double mesafe;
        int yas;
        double mesafeUcreti= 0.10;
        double toplamUcret;
        double indirimliUcret;
        int yolculukTipi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafe Pozitif olarak Girilmelidir");
        System.out.println("Yaş Değeri Pozitif olarak Girilmelidir");
        System.out.println("Yolculuk Tipi 1: Tekyön");
        System.out.println("Yolculuk Tipi 2: Gidiş-Dönüş");

        System.out.println("Mesafe Giriniz:");
        mesafe = scanner.nextDouble();

        toplamUcret = mesafe*mesafeUcreti;

        System.out.println("Yaş Giriniz:");
        yas = scanner.nextInt();

        System.out.println("Yolculuk Tipi Giriniz:");
        yolculukTipi = scanner.nextInt();

        if(yas > 0 && 0 < mesafe && yolculukTipi ==1) {

            if(yas<12){
                toplamUcret= toplamUcret-(toplamUcret/100)*50;

                System.out.println("Ücret:" + toplamUcret);
            }
            else if( 12 < yas && yas < 24){
                toplamUcret= toplamUcret- (toplamUcret/100)*10;

                System.out.println("Ücret:" + toplamUcret);
            }
            else if(65 < yas){
                toplamUcret= toplamUcret-(toplamUcret/100)*30;

                System.out.println("Ücret:" + toplamUcret);
            }else {

                System.out.println("Ücret:" + toplamUcret);

            }



        }else if (yas > 0 && 0 < mesafe && yolculukTipi ==2){


            if(yas<12){
                indirimliUcret = toplamUcret-(toplamUcret/100)*50;
                indirimliUcret = (indirimliUcret-(indirimliUcret/100)*20)*2;

                System.out.println("Ücret:" + indirimliUcret);
            }
            else if( 12 < yas && yas < 24){
                indirimliUcret= toplamUcret-(toplamUcret/100)*10;
                indirimliUcret = (indirimliUcret-(indirimliUcret/100)*20)*2;

                System.out.println("Ücret:" + indirimliUcret);
            }
            else if(65 < yas){
                indirimliUcret= toplamUcret-(toplamUcret/100)*30;
                indirimliUcret = (indirimliUcret-(indirimliUcret/100)*20)*2;

                System.out.println("Ücret:" + indirimliUcret);
            }

        }

        else {

            System.out.println("Hatalı Bilgi Girdiniz");
        }




    }
}
