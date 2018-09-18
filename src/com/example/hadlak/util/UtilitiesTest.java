package com.example.hadlak.util;

import org.junit.Assert;
import org.junit.Test;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        char[] actualResult = Utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        char[] expectedResult = new char[] {'e', 'l'};
        Assert.assertArrayEquals(expectedResult, actualResult);

        actualResult = Utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 6);
        expectedResult = new char[] {'h', 'e', 'l', 'l', 'o'};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @org.junit.Test
    public void removePairs() {
        Assert.assertEquals("ABCDEF", Utilities.removePairs("ABBCDEEF"));
        Assert.assertEquals("ABCBDEF", Utilities.removePairs("ABCBDEEF"));
        Assert.assertEquals("ABCBDEF", Utilities.removePairs("AABCBDEEFF"));
        Assert.assertEquals("A", Utilities.removePairs("AA"));
        Assert.assertEquals("A", Utilities.removePairs("AAA"));
        Assert.assertEquals("", Utilities.removePairs(""));
        Assert.assertNull(Utilities.removePairs(null));
    }

    @Test
    public void converter() {
        Assert.assertEquals(300, Utilities.converter(10, 5));
    }

    @Test
    public void nullIfOddLength() {
        Assert.assertNull(Utilities.nullIfOddLength("odd"));
        Assert.assertNotNull(Utilities.nullIfOddLength("even"));
        Assert.assertEquals("even", Utilities.nullIfOddLength("even"));
    }
}