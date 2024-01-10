package TD1.lesBoucles;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif n : ");
        int n = scanner.nextInt();

        int fibN = fibonacci(n);

        System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + fibN);

        scanner.close();
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
