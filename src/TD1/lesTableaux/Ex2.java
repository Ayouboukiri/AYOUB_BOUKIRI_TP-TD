package TD1.lesTableaux;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        String binaire = Integer.toBinaryString(N);

        System.out.println("La représentation binaire de " + N + " est : " + binaire);

        scanner.close();
    }
}
