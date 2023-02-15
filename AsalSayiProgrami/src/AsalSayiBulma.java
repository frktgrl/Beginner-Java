import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {

        int girilenSayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi sayıya kadar olan asal sayıları bulmak istiyorsunuz?");

        girilenSayi = scanner.nextInt();

        for (int i=2 ; i < girilenSayi;i++){

            boolean asal = true;

            for ( int j = 2 ; j < i ; j++){

                if ( i % j == 0) {

                    asal = false;
                    break;

                }
            }
            if (asal)
                System.out.print(i + ", ");

        }
    }
}
