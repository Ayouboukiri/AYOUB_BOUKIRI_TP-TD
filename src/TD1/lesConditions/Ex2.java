package TD1.lesConditions;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux solutions réelles : " + root1 + " et " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Une solution réelle : " + root);
        } else {
            System.out.println("Pas de solution réelle (racines imaginaires)");
        }

        scanner.close();
    }
}
