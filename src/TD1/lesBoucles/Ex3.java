package TD1.lesBoucles;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Entrez le nombre #" + i + " : ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
                position = i;
            }
        }

        System.out.println("Le maximum est : " + max + " à la position : " + position);

        scanner.close();
    }
}
