package services;

import org.junit.Assert;
import org.junit.Test;
import models.Book;


public class BookServiceTest {

    //given
    int expectedBookId = 1;
    int expectedIsbn = 125711;
    int expectedQuantity = 154;
    String expectedTitle = "Atlas Shrugged";
    String expectedAuthor = "Ayn Rand";
    String expectedGenre = "classic";
    float expectedPrice = 29.99f;

    int expectedBookId2 = 2;
    int expectedIsbn2 = 38601;
    int expectedQuantity2 = 172;
    String expectedTitle2 = "It";
    String expectedAuthor2 = "Stephen King";
    String expectedGenre2 = "horror";
    float expectedPrice2 = 19.99f;

    int expectedBookId3 = 3;
    int expectedIsbn3 = 112246;
    int expectedQuantity3 = 72;
    String expectedTitle3 = "A Chain of Thunder";
    String expectedAuthor3 = "Jeff Shaar";
    String expectedGenre3 = "historical fiction";
    float expectedPrice3 = 24.99f;

    BookService bookService = new BookService();



    @Test
    public void bookServiceCreateTest() {

        //create test model
        Book testBook = bookService.create(expectedIsbn, expectedQuantity, expectedTitle, expectedAuthor, expectedGenre, expectedPrice);

        //collect data from new book
        int actualBookId = testBook.getBookId();
        int actualIsbn = testBook.getIsbn();
        int actualQuantity = testBook.getQuantity();
        String actualTitle = testBook.getTitle();
        String actualAuthor = testBook.getAuthor();
        String actualGenre = testBook.getGenre();
        float actualPrice = testBook.getPrice();

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
    public void bookServiceFindByIdTest() {

        //create new book model
//        Book testBook = bookService.create(expectedIsbn, expectedQuantity, expectedTitle, expectedAuthor, expectedGenre, expectedPrice);
//        Book testBook2 = bookService.create(expectedIsbn2, expectedQuantity2, expectedTitle2, expectedAuthor2, expectedGenre2, expectedPrice2);
        String expectedTitle = "It";

        //when
//        String actualTitle = testBook2.getTitle();
        String actualTitle = bookService.findBook(3).getTitle();


        //then
//        Assert.assertEquals(Integer.class.getName(), Integer.class.getName());
//        Assert.assertEquals(actualTitle, bookService.findBook(expectedBookId2));
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void findAllTest() {
        System.out.println(bookService.findAll());
    }
}
