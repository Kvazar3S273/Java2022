package hw210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static program.Main.getRandomNumber;

public class hw210 {
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

        //---------------------------------------------------
        // Створюємо ліст від'ємних елементів
        List<Integer> listNeg = new ArrayList<Integer>();

        // Заповнюємо ліст від'мними елементами
        for (int i = 0; i < n; i++) {
            if (mas[i] < 0) {
                listNeg.add(mas[i]);
            }
        }
        System.out.println();

        // Перетворюємо ліст в масив
        Object[] arrNeg = listNeg.toArray();
        // Виводимо масив
        System.out.println("Масив від'ємних елементів: ");
        for (Object item : arrNeg) {
            System.out.print(item + "  ");
        }

        //---------------------------------------------------
        // Створюємо ліст додатніх елементів
        List<Integer> listPos = new ArrayList<Integer>();

        // Заповнюємо ліст додатніми елементами
        for (int i = 0; i < n; i++) {
            if (mas[i] > 0) {
                listPos.add(mas[i]);
            }
        }
        System.out.println();

        // Перетворюємо ліст в масив
        Object[] arrPos = listPos.toArray();
        // Виводимо масив
        System.out.println("Масив додатніх елементів:");
        for (Object item : arrPos) {
            System.out.print(item + "  ");
        }

        //---------------------------------------------------
        // Створюємо ліст парних елементів
        List<Integer> listPair = new ArrayList<Integer>();

        // Заповнюємо ліст парними елементами
        for (int i = 0; i < n; i++) {
            if (mas[i] % 2 == 0) {
                listPair.add(mas[i]);
            }
        }
        System.out.println();

        // Перетворюємо ліст в масив
        Object[] arrPair = listPair.toArray();
        // Виводимо масив
        System.out.println("Масив парних елементів:");
        for (Object item : arrPair) {
            System.out.print(item + "  ");
        }

        //---------------------------------------------------
        // Створюємо ліст непарних елементів
        List<Integer> listOdd = new ArrayList<Integer>();

        // Заповнюємо ліст парними елементами
        for (int i = 0; i < n; i++) {
            if (mas[i] % 2 != 0) {
                listOdd.add(mas[i]);
            }
        }
        System.out.println();

        // Перетворюємо ліст в масив
        Object[] arrOdd = listOdd.toArray();
        // Виводимо масив
        System.out.println("Масив непарних елементів:");
        for (Object item : arrOdd) {
            System.out.print(item + "  ");
        }
    }
}
