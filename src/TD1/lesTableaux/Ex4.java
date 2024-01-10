package TD1.lesTableaux;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie de la taille des matrices carrées
        System.out.print("Entrez la taille des matrices carrées (n x n) : ");
        int n = scanner.nextInt();

        // Saisie des éléments de la première matrice
        System.out.println("Saisie de la première matrice :");
        double[][] matrice1 = saisirMatrice(n);

        // Saisie des éléments de la deuxième matrice
        System.out.println("Saisie de la deuxième matrice :");
        double[][] matrice2 = saisirMatrice(n);

        // Addition des matrices
        double[][] resultat = additionnerMatrices(matrice1, matrice2);

        // Affichage du résultat
        System.out.println("La somme des deux matrices est :");
        afficherMatrice(resultat);

        scanner.close();
    }

    static double[][] saisirMatrice(int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Entrez l'élément [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    static double[][] additionnerMatrices(double[][] matrice1, double[][] matrice2) {
        int n = matrice1.length;
        double[][] resultat = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return resultat;
    }

    static void afficherMatrice(double[][] matrice) {
        int n = matrice.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
