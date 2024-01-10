package TD1.lesBoucles;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        // Algorithme d'Euclide
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int pgcd = a;

        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);

        scanner.close();
    }
}
