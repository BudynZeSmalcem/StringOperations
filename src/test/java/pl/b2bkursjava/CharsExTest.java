package pl.b2bkursjava;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharsExTest {

    private CharsEx charsEx = new CharsEx();

    @Test
    public void wordFromEvenIndex() {
        assertEquals("oe", charsEx.wordFromEvenIndex("kotek"));
    }

    @Test
    public void wordFromUnevenIndex() {
        assertEquals("ktk", charsEx.wordFromUnevenIndex("kotek"));
    }

    @Test
    public void halfOfWord() {
        assertEquals("kot", charsEx.halfOfWord("kotek"));
    }

    @Test
    public void howManyLettersA() {
        assertEquals(2, charsEx.howManyLettersA("abecadlo"));
    }
}