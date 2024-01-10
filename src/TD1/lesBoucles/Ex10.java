package TD1.lesBoucles;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int digit1 = i / 100;
            int digit2 = (i / 10) % 10;
            int digit3 = i % 10;

            if (i == Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3)) {
                System.out.println(i + " est cubique.");
            }
        }
    }
}
