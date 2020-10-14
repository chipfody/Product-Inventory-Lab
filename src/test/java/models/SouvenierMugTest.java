package models;

import org.junit.Assert;
import org.junit.Test;

public class SouvenierMugTest {

    @Test
    public void souvenierMugConstructorTest() {
        //given
        int expectedId = 2468;
        int expectedQuantity = 27;
        String expectedState = "Delaware";
        int expectedSizeOz = 16;
        float expectedPrice = 12.99f;

        //when
        SouvenierMug testSouvenierMug = new SouvenierMug(expectedId, expectedQuantity, expectedState, expectedSizeOz, expectedPrice);

        //then
        Assert.assertEquals(expectedId, testSouvenierMug.getId());
        Assert.assertEquals(expectedQuantity, testSouvenierMug.getQuantity());
        Assert.assertEquals(expectedState, testSouvenierMug.getState());
        Assert.assertEquals(expectedSizeOz, testSouvenierMug.getSizeOz());
        Assert.assertEquals(expectedPrice, testSouvenierMug.getPrice(),2);

    }
}
