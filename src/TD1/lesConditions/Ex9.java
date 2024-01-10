package TD1.lesConditions;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        if (variable1 > variable2) {
            int temp = variable1;
            variable1 = variable2;
            variable2 = temp;
        }

        System.out.println("Les variables dans l'ordre croissant : " + variable1 + ", " + variable2);

        scanner.close();
    }
}
