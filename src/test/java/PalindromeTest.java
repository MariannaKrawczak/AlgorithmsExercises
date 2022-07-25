import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }
// returnsTrueForValidPalindrome, returnsTrueForMixedCasePalindrome

    @Test
    void abbaShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("abba"));
    }

    @Test
    void mariannaShouldReturnFalse() {
        assertFalse(palindrome.isPalindrome("marianna"));
    }

    @Test
    void stringRaCEcarShouldReturnTrue() {
        assertTrue(palindrome.isPalindrome("RaCEcar"));
    }

}