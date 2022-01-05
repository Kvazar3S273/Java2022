package hw212;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static hw23.hw23.readInputInt;

import static program.Main.getRandomNumber;

public class hw212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 20;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = getRandomNumber(-5, 25);
        System.out.println("Це масив до сортування:");
        for (int item : arr) {
            System.out.print(item + "   ");
        }
        System.out.println("\nВиберіть як сортувати масив:");
        System.out.println("1 - за зростанням");
        System.out.println("2 - за спаданням");
        int choice = readInputInt();
        switch (choice) {
            case 1:
                Arrays.sort(arr);
                System.out.println("Це масив після сортування за зростанням:");
                for (int item : arr) {
                    System.out.print(item + "   ");
                }
                break;
            case 2:
                Arrays.sort(arr, Collections.reverseOrder());
                System.out.println("\nЦе масив після сортування за спаданням:");
                for (int item : arr) {
                    System.out.print(item + "   ");
                }
                break;
            default:
                System.out.println("Неправильно введене число!");
        }
    }
}
