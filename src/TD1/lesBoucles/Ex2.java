package TD1.lesBoucles;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < N; i += 2) {
            sum += i;
        }

        System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + sum);

        scanner.close();
    }
}
