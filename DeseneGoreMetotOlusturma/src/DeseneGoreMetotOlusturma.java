import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

        static void number ( int a, int d, boolean girilenSayi){

            if (a <= 0)
                girilenSayi = true;
            System.out.println(a + "");
            if (girilenSayi == false)
                number(a - 5, d + 1, girilenSayi);
            else {
                if (d == 0)
                    return;
                else
                    number(a + 5, d - 1, girilenSayi);

            }
        }
        public static void main (String[]args){

             int girilenSayi;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayıyı Giriniz: ");

            girilenSayi = scanner.nextInt();

            number(girilenSayi, 0, false);

        }
    }


