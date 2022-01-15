package hw36;

import java.util.Scanner;

public class AutomobileResource {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        auto = setNewAutomobile();
        System.out.println(auto.ToString());
        System.out.println("Марка автомобіля " + auto.getMark());
        System.out.println("Рік випуску " + auto.getYearMade());
    }

    public static Automobile setNewAutomobile() {
        Scanner in = new Scanner(System.in);
        Automobile result = new Automobile();

        System.out.println("Введіть назву автомобіля");
        String nam = in.nextLine();

        System.out.println("Введіть марку виробника");
        String mrk = in.nextLine();

        System.out.println("Введіть рік виробництва");
        int ye = Integer.parseInt(in.next());

        System.out.println("Введіть об'єм двигуна");
        int cap = Integer.parseInt(in.next());

        result.setName(nam);
        result.setMark(mrk);
        result.setYearMade(ye);
        result.setEngineCapacity(cap);

        return result;
    }
}
