package hw23;

import java.util.Scanner;

public class hw23 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Введіть три цифри:");
        System.out.print("перша:   ");
        a = readInputInt();
        System.out.print("друга:   ");
        b = readInputInt();
        System.out.print("третя:   ");
        c = readInputInt();
        System.out.println(100 * a + 10 * b + c);
    }

    private static int readInputInt() {
        Scanner s = new Scanner(System.in);
        int result;
        while (true) {
            if (s.hasNextInt()) {
                result = s.nextInt();
                return result;
            } else {
                s.next();
                System.out.println("це не цифра, введіть ще раз:");
            }
        }
    }
}
