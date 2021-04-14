package services;

import models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private static int nextBookId = 1;
    private List<Book> bookList = new ArrayList<>();

    public Book create(int isbn, int quantity, String title, String author, String genre, float price) {

        return new Book(nextBookId++, isbn, quantity, title, author, genre,price);
    }

    public Book findBook(int bookId) {
        Book foundBook = null;

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).getTitle());
            if (i == bookId) {
                foundBook = bookList.get(i);
                break;
            }
        }
        return foundBook;
    }


    public Book[] findAll() {
        Book[] library = bookList.toArray(new Book[0]);
        for (int i = 0; i < bookList.size(); i++) {
            library[i] = bookList.get(i);
        }
        return library;
    }

}
