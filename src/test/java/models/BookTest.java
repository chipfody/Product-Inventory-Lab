package models;

import org.junit.Assert;
import org.junit.Test;

import java.awt.print.Book;

public class BookTest {

@Test
public void constructorTest() {
    //given
    int expectedIsbn = 23576;
    int expectedQuantity = 137;
    String expectedTitle = "Moby Dick";
    String expectedAuthor = "Herman Melville";
    String expectedGenre = "classic";
    float expectedPrice = 19.99f;

    //when
    Books testBook = new Books(expectedIsbn, expectedQuantity, expectedTitle, expectedAuthor, expectedGenre, expectedPrice);

    //then
    Assert.assertEquals(expectedIsbn, testBook.getIsbn());
    Assert.assertEquals(expectedQuantity, testBook.getQuantity());
    Assert.assertEquals(expectedTitle, testBook.getTitle());
    Assert.assertEquals(expectedAuthor, testBook.getAuthor());
    Assert.assertEquals(expectedGenre, testBook.getGenre());
    Assert.assertEquals(expectedPrice, testBook.getPrice(), 2);

}


}
