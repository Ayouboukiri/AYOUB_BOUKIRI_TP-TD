package TD1.lesTableaux;

public class Ex5 {
    public static void main(String[] args) {
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        System.out.println("Tableau initial : ");
        afficherTableau(tableau);

        // Décalage des éléments du tableau
        char temp = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            tableau[i - 1] = tableau[i];
        }

        tableau[tableau.length - 1] = temp;

        System.out.println("\nTableau modifié : ");
        afficherTableau(tableau);
    }

    static void afficherTableau(char[] tableau) {
        for (char element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
