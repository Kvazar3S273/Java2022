package hw34;

import static hw23.hw23.readInputInt;

public class FractionResource {
    public static void main(String[] args) {
        Fraction fr = new Fraction();
        int num;
        int den;
        System.out.print("Введіть чисельник: ");
        num = readInputInt();
        System.out.print("Введіть знаменник: ");
        den = readInputInt();
        fr.setNumerator(num);
        fr.setDenominator(den);
        System.out.println(fr.ToString());

        Fraction a = new Fraction(5, 7);
        System.out.println(a.ToString());

        Fraction b = new Fraction(3, 4);
        Fraction c = new Fraction(5, 7);

        Fraction resSum = summ(b, c);
        System.out.print(b.ToString() + " + " + c.ToString() + " = " + resSum.ToString());

        System.out.println();
        Fraction resSubs = subtraction(b, c);
        System.out.print(b.ToString() + " - " + c.ToString() + " = " + resSubs.ToString());

        System.out.println();
        Fraction resMult = multiplication(b, c);
        System.out.print(b.ToString() + " * " + c.ToString() + " = " + resMult.ToString());

        System.out.println();
        Fraction resDiv = division(b, c);
        System.out.print(b.ToString() + " : " + c.ToString() + " = " + resDiv.ToString());
    }

    public static Fraction summ(Fraction first, Fraction second) {
        Fraction result = new Fraction();
        result.setNumerator(first.getNumerator() * second.getDenominator() + second.getNumerator() * first.getDenominator());
        result.setDenominator(first.getDenominator() * second.getDenominator());
        return result;
    }

    public static Fraction subtraction(Fraction first, Fraction second) {
        Fraction result = new Fraction();
        result.setNumerator(first.getNumerator() * second.getDenominator() - second.getNumerator() * first.getDenominator());
        result.setDenominator(first.getDenominator() * second.getDenominator());
        return result;
    }

    public static Fraction multiplication(Fraction first, Fraction second) {
        Fraction result = new Fraction();
        result.setNumerator(first.getNumerator() * second.getNumerator());
        result.setDenominator(first.getDenominator() * second.getDenominator());
        return result;
    }

    public static Fraction division(Fraction first, Fraction second) {
        Fraction result = new Fraction();
        result.setNumerator(first.getNumerator() * second.getDenominator());
        result.setDenominator(first.getDenominator() * second.getNumerator());
        return result;
    }
}
