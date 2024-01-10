package TD1.lesConditions;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (0-23) : ");
        int heure = scanner.nextInt();

        System.out.print("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
        char langue = scanner.next().charAt(0);

        if (langue == 'f') {
            if (heure >= 0 && heure < 18) {
                System.out.println("Bonjour");
            } else if (heure >= 18 && heure <= 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        } else if (langue == 'a') {
            if (heure >= 0 && heure < 18) {
                System.out.println("Good Morning");
            } else if (heure >= 18 && heure <= 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Langue non prise en charge");
        }

        scanner.close();
    }
}
