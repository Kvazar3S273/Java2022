package hw26;

import static hw23.hw23.readInputInt;

public class hw26 {
    public static void main(String[] args) {
        int meter;
        System.out.println("Введіть довжину в метрах:");
        meter = readInputInt();
        System.out.println("В що перевести? (натисніть цифру)");
        System.out.println("1 - милі");
        System.out.println("2 - дюйми");
        System.out.println("3 - ярди");
        int choice = readInputInt();
        switch (choice) {
            case 1:
                System.out.println(meter + " метрів в милях =  " + meter * 0.000621371 + " миль");
                break;
            case 2:
                System.out.println(meter + " метрів в дюймах =  " + meter * 39.37 + " дюймів");
                break;
            case 3:
                System.out.println(meter + " метрів в ярдах =  " + meter * 1.094 + " ярдів");
                break;
            default:
                System.out.println("Неправильно введене число!");
        }
    }
}
