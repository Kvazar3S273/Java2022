package hw22;

import java.util.Scanner;

public class hw22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int percent;
        System.out.println("Введіть число");
        number = Integer.parseInt(in.next());
        System.out.println("Введіть процент");
        percent = Integer.parseInt(in.next());
        System.out.print(percent + "%" + " від " + number + " =  ");
        System.out.println(percent*number/100);
    }
}
