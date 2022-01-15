package hw35;

import java.util.Scanner;

public class BookResource {
    public static void main(String[] args) {
        Book book = new Book();
        book = setNewBook();
        System.out.println(book.ToString());
        System.out.println("Жанр книги "+book.getGenre());
        System.out.println("Видавництво "+book.getPublishing());
        System.out.println("Кількість сторінок "+book.getCountPage());
    }

    public static Book setNewBook() {
        Scanner in = new Scanner(System.in);
        Book result = new Book();

        System.out.println("Введіть назву книги");
        String tit = in.nextLine();

        System.out.println("Введіть автора");
        String auth= in.nextLine();

        System.out.println("Введіть назву видавництва");
        String publ = in.nextLine();

        System.out.println("Введіть жанр");
        String gen = in.nextLine();

        System.out.println("Введіть рік видавництва");
        int ye = Integer.parseInt(in.next());

        System.out.println("Введіть кількість сторінок");
        int coPage = Integer.parseInt(in.next());

        result.setTitle(tit);
        result.setAuthor(auth);
        result.setYearPrint(ye);
        result.setPublishing(publ);
        result.setGenre(gen);
        result.setCountPage(coPage);

        return result;
    }

}