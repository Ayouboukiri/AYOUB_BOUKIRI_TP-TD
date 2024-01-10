package TD1.lesBoucles;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Le factoriel n'est défini que pour les entiers naturels.");
        } else {
            long factoriel = 1;

            for (int i = 1; i <= N; i++) {
                factoriel *= i;
            }

            System.out.println("Le factoriel de " + N + " est : " + factoriel);
        }

        scanner.close();
    }

}
