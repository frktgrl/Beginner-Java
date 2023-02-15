import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eleman Sayısı Giriniz");

        int elemanSayisi = scanner.nextInt();
        int temp = 0;
        int temp2 = 1;


        for(int i = 1; i <= elemanSayisi; i++){

            System.out.print(temp +" ");

            int sum = temp + temp2;

            temp = temp2;
            temp2 = sum;
        }
    }

}
