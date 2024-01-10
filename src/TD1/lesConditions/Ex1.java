package TD1.lesConditions;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer trois nombres
        System.out.print("Entrez le premier nombre : ");
        int num1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int num2 = scanner.nextInt();

        System.out.print("Entrez le troisième nombre : ");
        int num3 = scanner.nextInt();

        // Trouver le maximum des trois nombres avec des conditions
        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Afficher le résultat
        System.out.println("Le maximum des trois nombres est : " + max);

        // Fermer le scanner pour libérer les ressources
        scanner.close();
    }
}
