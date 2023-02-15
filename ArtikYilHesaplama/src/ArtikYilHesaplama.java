import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int hesaplanacakYil;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesaplama istediğiniz yılı giriniz:");
        hesaplanacakYil = scanner.nextInt();

        if(hesaplanacakYil % 4 == 0 && hesaplanacakYil % 100 != 0) {

            System.out.println("Artık Yıldır");

        } else if (hesaplanacakYil % 400 == 0) {

            System.out.println("Artık Yıldır");


        }else {


            System.out.println("Artık Yıl Değildir");
        }


    }
}
