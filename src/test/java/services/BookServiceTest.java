package services;

import junit.framework.Assert;
import org.junit.Test;

import models.Book;

public class BookServiceTest {

    @Test
    public void bookServiceCreateTest() {

        //given
        int expectedBookId = 1;
        int expectedIsbn = 125711;
        int expectedQuantity = 154;
        String expectedTitle = "Atlas Shrugged";
        String expectedAuthor = "Ayn Rand";
        String expectedGenre = "classic";
        float expectedPrice = 29.99f;

        //create test model
        BookService bookService = new BookService();
        Book testBook2 = bookService.create(expectedIsbn, expectedQuantity, expectedTitle, expectedAuthor, expectedGenre, expectedPrice);

        //collect data from new book
        int actualBookId = testBook2.getBookId();
        int actualIsbn = testBook2.getIsbn();
        int actualQuantity = testBook2.getQuantity();
        String actualTitle = testBook2.getTitle();
        String actualAuthor = testBook2.getAuthor();
        String actualGenre = testBook2.getGenre();
        float actualPrice = testBook2.getPrice();

        //then
        Assert.assertEquals(expectedBookId, actualBookId);
        Assert.assertEquals(expectedIsbn, actualIsbn);
        Assert.assertEquals(expectedQuantity, actualQuantity);
        Assert.assertEquals(expectedTitle, actualTitle);
        Assert.assertEquals(expectedAuthor, actualAuthor);
        Assert.assertEquals(expectedGenre, actualGenre);
        Assert.assertEquals(expectedPrice, actualPrice, 2);
    }

    @Test
    public void
}
