package TD1.lesTableaux;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        System.out.print("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        double[] moyennes = new double[nombreEtudiants];

        // Saisie des moyennes des étudiants
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Entrez la moyenne de l'étudiant #" + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Comptage des moyennes supérieures ou égales au seuil
        int count = 0;

        for (int i = 0; i < nombreEtudiants; i++) {
            if (moyennes[i] >= seuil) {
                count++;
            }
        }

        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : " + count);

        scanner.close();
    }
}
