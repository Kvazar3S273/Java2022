package hw29;

import java.util.Scanner;
import static program.Main.getRandomNumber;

public class hw29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 20;
        int min, max;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = getRandomNumber(-10, 10);
        for (int item : mas) {
            System.out.print(item + "   ");
        }
        System.out.println();
        min = max = mas[0];

        // шукаємо найбільший і найменший елементи масива
        for (int i = 0; i < n; i++) {
            if (mas[i] < min)
                min = mas[i];
            if (mas[i] > max)
                max = mas[i];
        }
        System.out.println("Найменший елемент масива:  " + min);
        System.out.println("Найбільший елемент масива:  " + max);

        // шукаємо кількість додатніх і від'ємних елементів масива
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (mas[i] < 0)
                countNegative++;
            if (mas[i] > 0)
                countPositive++;
            if (mas[i] == 0)
                countZero++;
        }
        System.out.println("Кількість від'ємних елементів масива:  " + countNegative);
        System.out.println("Кількість від'ємних елементів масива:  " + countPositive);
        System.out.println("Кількість нульових елементів масива:  " + countZero);
    }
}
