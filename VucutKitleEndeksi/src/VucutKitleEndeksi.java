import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.println("Kilonuzu Giriniz:");
        kilo = scan.nextDouble();

        System.out.println("Boyunuzu Metre Olarak Giriniz:");
        boy = scan.nextDouble();

        indeks = kilo / (boy*boy) ;

        System.out.println("Vücut kitle endeksiniz"+ indeks);





    }
}