package hw211;

import java.util.Scanner;

import static hw23.hw23.readInputInt;

public class hw211 {
    public static void main(String[] args) {
        System.out.println("Введіть символ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("Введіть довжину лінії");
        int length = readInputInt();
        System.out.println("Виберіть орієнтацію:");
        System.out.println("1 - по горизонталі");
        System.out.println("2 - по вертикалі");
        int choice = readInputInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < length; i++) {
                    System.out.print(ch);
                }
                break;

            case 2:
                for (int i = 0; i < length; i++) {
                    System.out.println(ch);
                }
                break;
            default:
                System.out.println("Неправильно введене число!");
        }


    }
}
