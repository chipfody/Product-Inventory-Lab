package models;

import org.junit.Assert;
import org.junit.Test;


public class BookTest {

@Test
public void constructorTest() {
    //given
    int expectedBookId = 1;
    int expectedIsbn = 23576;
    int expectedQuantity = 137;
    String expectedTitle = "Moby Dick";
    String expectedAuthor = "Herman Melville";
    String expectedGenre = "classic";
    float expectedPrice = 19.99f;

    //when
    Book testBook = new Book(expectedBookId, expectedIsbn, expectedQuantity, expectedTitle, expectedAuthor, expectedGenre, expectedPrice);

    //then
    Assert.assertEquals(expectedBookId, testBook.getBookId());
    Assert.assertEquals(expectedIsbn, testBook.getIsbn());
    Assert.assertEquals(expectedQuantity, testBook.getQuantity());
    Assert.assertEquals(expectedTitle, testBook.getTitle());
    Assert.assertEquals(expectedAuthor, testBook.getAuthor());
    Assert.assertEquals(expectedGenre, testBook.getGenre());
    Assert.assertEquals(expectedPrice, testBook.getPrice(), 2);

}


}
