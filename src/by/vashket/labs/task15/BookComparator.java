package by.vashket.labs.task15;

import java.util.*;

import by.vashket.labs.task12.Book;

public class BookComparator {
    public static void main(String[] args) {
        Collection<Book> books = Set.of(
                new Book("Война и мир", "Толстой", 1, 3),
                new Book("Первому игроку приготовиться", "Клайн", 20, 4),
                new Book("Хоббит, или Туда и обратно", "Толкин", 50, 5),
                new Book("Три товарища", "Ремарк", 100, 8),
                new Book("О дивный новый мир", "Хаксли", 10, 10));
        SortedSet<Book> bookSortedSet = new TreeSet<>(books);
        System.out.println(bookSortedSet);
        List<Book> bookList = new ArrayList<>(books);
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor);
        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle);
        Comparator<Book> authorTitlePriceComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice);
        bookList.sort(titleComparator);
        System.out.println(bookList);
        bookList.sort(titleAuthorComparator);
        System.out.println(bookList);
        bookList.sort(authorTitleComparator);
        System.out.println(bookList);
        bookList.sort(authorTitlePriceComparator);
        System.out.println(bookList);
    }
}
