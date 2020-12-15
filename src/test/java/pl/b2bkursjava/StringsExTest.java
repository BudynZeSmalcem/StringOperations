package pl.b2bkursjava;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringsExTest {
    private StringsEx stringsEx = new StringsEx();

    @Test
    public void howManyLettersCat() {
        assertEquals(3, stringsEx.howManyLetters("Cat"));
    }

    @Test
    public void ifStringContainsMRTrue() {
        assertTrue(stringsEx.ifStringContainsMR("MROK"));
    }

    @Test
    public void changeIETo91Cielecina() {
        assertEquals("C91LECINA", stringsEx.changeIETo91("CIELECINA"));
    }

    @Test
    public void sumOf2IndexesMartaKrysia() {
        assertEquals(5, stringsEx.sumOf2Indexes("Krysia", "Marta"));
    }

    @Test
    public void addKompotAmanient() {
        assertEquals("kompotmanient", stringsEx.addKompot("Amanient"));
    }

    @Test
    public void lastThreeLettersSmak() {
        assertEquals("mak", stringsEx.lastThreeLetters("Smak"));
    }

    @Test
    public void firstLetterFalse() {
        assertFalse(stringsEx.firstLetter("Raczek", "N"));
    }

    @Test
    public void howManyLettersWysublimowany() {
        assertEquals(13, stringsEx.howManyLetters("Wysublimowany"));
    }

    @Test
    public void ifStringContainsMRFalse() {
        assertFalse(stringsEx.ifStringContainsMR("no nie"));
    }

    @Test
    public void changeIETo91Pieprz() {
        assertEquals("p91prz", stringsEx.changeIETo91("pIEprz"));
    }

    @Test
    public void sumOf2IndexesAkapit() {
        assertEquals(8, stringsEx.sumOf2Indexes("Marysia", "Kuba"));
    }

    @Test
    public void addKompotIbatybilny() {
        assertEquals("kompotbatybilny", stringsEx.addKompot("Ibatybilny"));
    }

    @Test
    public void lastThreeLettersKrzak() {
        assertEquals("zak", stringsEx.lastThreeLetters("Krzak"));
    }

    @Test
    public void firstLetterTrue() {
        assertTrue(stringsEx.firstLetter("Kebap", "K"));
    }
}