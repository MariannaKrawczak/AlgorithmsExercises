import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void whenGivenEvenStringReturnsCorrect() {
        assertEquals("annairaM",reverseString.reverseString("Marianna"));
    }

    @Test
    void whenGivenOddStringReturnsCorrect() {
        assertEquals("eromalluT",reverseString.reverseString("Tullamore"));
    }

    @Test
    void whenGivenEvenStringReturnsCorrect2() {
        assertEquals("annairaM",reverseString.reverseString2("Marianna"));
    }

    @Test
    void whenGivenOddStringReturnsCorrect2() {
        assertEquals("eromalluT",reverseString.reverseString2("Tullamore"));
    }



}