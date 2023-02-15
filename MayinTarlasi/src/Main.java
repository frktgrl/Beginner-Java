import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rowInput;
        int colInput;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Sayısı Giriniz: ");
        rowInput= scanner.nextInt();
        System.out.print("Sütun Sayısı Giriniz: ");
        colInput= scanner.nextInt();



        MineSweeper mine = new MineSweeper(rowInput,colInput);
        mine.run();
    }
}