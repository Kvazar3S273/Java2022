package hw35;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private int yearPrint;
    private String publishing;
    private String genre;
    private int countPage;

    public String ToString() {
        return String.format("Назва книги: " + title + "\n" +
                "Автор: " + author + "\n" +
                "Рік видавництва : " + yearPrint + "\n" +
                "Видавництво : " + publishing + "\n" +
                "Жанр: " + genre + "\n" +
                "К-сть сторінок: " + countPage + "\n");
    }
}

