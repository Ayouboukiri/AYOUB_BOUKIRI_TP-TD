package TD1.lesTableaux;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
        int N = scanner.nextInt();

        if (N < 10 || N > 50) {
            System.out.println("La taille du tableau doit être entre 10 et 50.");
        } else {
            int[] tableau = new int[N];

            // Saisie des éléments du tableau
            for (int i = 0; i < N; i++) {
                System.out.print("Entrez l'élément #" + (i + 1) + " : ");
                tableau[i] = scanner.nextInt();
            }

            // Recherche de la valeur maximale et minimale
            int min = tableau[0];
            int max = tableau[0];

            for (int i = 1; i < N; i++) {
                if (tableau[i] < min) {
                    min = tableau[i];
                }

                if (tableau[i] > max) {
                    max = tableau[i];
                }
            }

            // Affichage des résultats
            System.out.println("La valeur minimale du tableau est : " + min);
            System.out.println("La valeur maximale du tableau est : " + max);
        }

        scanner.close();
    }
}
