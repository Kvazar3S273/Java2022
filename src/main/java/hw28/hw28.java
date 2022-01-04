package hw28;

import static hw23.hw23.readInputInt;

public class hw28 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Введіть перше число:");
        a = readInputInt();
        System.out.println("Введіть друге число:");
        b = readInputInt();
        System.out.println("Таблиця множення в заданому діапазоні: ");
        for (int i = a; i <= b; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
