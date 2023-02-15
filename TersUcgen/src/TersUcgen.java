import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayi;

        System.out.println("Basamak Sayısı Giriniz:");

        Scanner scanner = new Scanner(System.in);
        basamakSayi = scanner.nextInt();

        for (int i = 1; i <= basamakSayi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * basamakSayi - 1; k >= (2 * i - 1); k--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
