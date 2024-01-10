package TD1.lesBoucles;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        int somme = 0;

        while (nombre != 0) {
            somme += nombre % 10;
            nombre /= 10;
        }

        System.out.println("La somme des chiffres est : " + somme);

        scanner.close();
    }
}
