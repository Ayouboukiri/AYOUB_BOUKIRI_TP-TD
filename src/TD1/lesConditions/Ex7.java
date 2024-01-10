package TD1.lesConditions;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int N = scanner.nextInt();

        int digit1 = N / 100;
        int digit2 = (N / 10) % 10;
        int digit3 = N % 10;

        System.out.println("Les nombres formés par les chiffres de N sont :");

        System.out.print(digit1 * 100 + digit2 * 10 + digit3 + ", ");
        System.out.print(digit1 * 100 + digit3 * 10 + digit2 + ", ");
        System.out.print(digit2 * 100 + digit1 * 10 + digit3 + ", ");
        System.out.print(digit2 * 100 + digit3 * 10 + digit1 + ", ");
        System.out.print(digit3 * 100 + digit1 * 10 + digit2 + ", ");
        System.out.println(digit3 * 100 + digit2 * 10 + digit1);

        scanner.close();
    }
}

