package TD1.lesBoucles;

import java.util.Scanner;

public class Ex3_suite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int position = 0;
        int number;

        do {
            System.out.print("Entrez un nombre (ou 0 pour terminer) : ");
            number = scanner.nextInt();
            position++;

            if (number > max) {
                max = number;
            }
        } while (number != 0);

        System.out.println("Le maximum est : " + max + " à la position : " + (position - 1));

        scanner.close();
    }
}
