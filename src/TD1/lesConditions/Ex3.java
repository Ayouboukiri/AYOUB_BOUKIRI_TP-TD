package TD1.lesConditions;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        System.out.println("Choisissez une option :");
        System.out.println("1. Somme a + b est paire");
        System.out.println("2. Produit ab est pair");
        System.out.println("3. Signe de la somme a + b");
        System.out.println("4. Signe du produit ab");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("La somme a + b est " + ((a + b) % 2 == 0 ? "paire" : "impaire"));
                break;
            case 2:
                System.out.println("Le produit ab est " + (a * b % 2 == 0 ? "pair" : "impair"));
                break;
            case 3:
                System.out.println("Le signe de la somme a + b est " + (a + b > 0 ? "positif" : "négatif"));
                break;
            case 4:
                System.out.println("Le signe du produit ab est " + (a * b > 0 ? "positif" : "négatif"));
                break;
            default:
                System.out.println("Option non valide");
        }

        scanner.close();
    }
}
