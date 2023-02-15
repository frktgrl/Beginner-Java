import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplam;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kilosu Giriniz: ");
        armutKilo = scanner.nextDouble();

        System.out.println("Elma Kilosu Giriniz: ");
        elmaKilo = scanner.nextDouble();

        System.out.println("Domates Kilosu Giriniz: ");
        domatesKilo = scanner.nextDouble();

        System.out.println("Muz Kilosu Giriniz: ");
        muzKilo = scanner.nextDouble();

        System.out.println("Patlıcan Kilosu Giriniz: ");
        patlicanKilo = scanner.nextDouble();

        toplam = (armutKilo*armut) + (elmaKilo*elma) + (domatesKilo*domates) + (muzKilo*muz) + (patlicanKilo*patlican);

        System.out.println("Toplam Ücret:"+ toplam);





    }
}
