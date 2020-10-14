package services;

import models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private static int nextBookId = 1;

    private List<Book> bookList = new ArrayList<>();

    public Book create(int isbn, int quantity, String title, String author, String genre, float price) {

        Book newBook = new Book(nextBookId++, isbn, quantity, title, author, genre,price);

    return newBook;
    }
}
