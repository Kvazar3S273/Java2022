package hw24;

import java.util.Scanner;
import static hw23.hw23.readInputInt;

public class hw24 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введіть шестизначне число:");
        number = readInputInt();
        String str = Integer.toString(number); // переводимо число в рядок
        char[] numbs = str.toCharArray(); // переводимо рядок в масив символів
        int len = numbs.length; // взнаємо довжину масиву
        if (len != 6) { // визначаємо чи вводилось шестизначне число
            System.out.println("Вас просили ввести тільки шестизначне число");
        } else {
            System.out.println(reverseArray(numbs)); // якщо все добре, то проводимо реверсування числа
        }
    }

    // Робимо реверсивне число
    public static int reverseArray(char[]arrch){
        char a;
        char b;
        a=arrch[0];
        b=arrch[1];
        arrch[0]=arrch[5];
        arrch[1]=arrch[4];
        arrch[4]=b;
        arrch[5]=a;
        String revStr=String.valueOf(arrch);
        int revInt=Integer.parseInt(revStr);
        return revInt;
    }
}
