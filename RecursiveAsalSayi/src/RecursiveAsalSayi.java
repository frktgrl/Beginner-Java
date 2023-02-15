import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {

        int girilenSayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz:");
        girilenSayi =scanner.nextInt();

        System.out.println(asalHesapla(girilenSayi,2));

    }

    static boolean asalHesapla(int girilenSayi,int c){

        if (girilenSayi < 2) {

            System.out.println(girilenSayi+" Sayısı asal değildir.");
            return (girilenSayi == 2) ? true : false;
        }
        if (girilenSayi == c) {
            System.out.println(girilenSayi+" Sayısı asaldır.");
            return true;

        }
        if (girilenSayi % c == 0) {
            System.out.println(girilenSayi+" Sayısı asal değildir.");
            return false;
        }
        return asalHesapla(girilenSayi, c + 1);

    }
}
