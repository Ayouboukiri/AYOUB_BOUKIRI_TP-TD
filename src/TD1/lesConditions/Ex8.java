package TD1.lesConditions;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numéro du mois : ");
        int mois = scanner.nextInt();

        int jours;

        if (mois >= 1 && mois <= 12) {
            if (mois == 2) {
                System.out.print("Entrez l'année (1900-2100) : ");
                int annee = scanner.nextInt();

                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    jours = 29;
                } else {
                    jours = 28;
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                jours = 30;
            } else {
                jours = 31;
            }

            System.out.println("Le mois " + mois + " a " + jours + " jours.");
        } else {
            System.out.println("Mois non valide.");
        }

        scanner.close();
    }
}
