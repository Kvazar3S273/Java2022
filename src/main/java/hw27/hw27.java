package hw27;

import static hw23.hw23.readInputInt;

public class hw27 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Введіть перше число:");
        a = readInputInt();
        System.out.println("Введіть друге число:");
        b = readInputInt();
        System.out.println("Всі непарні числа в заданому діапазоні: ");
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
