package JUnit.testing.calculator.Strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    @Test
    void Test() {
        stringUtility st = new stringUtility();

        // Test reverseString
        assertEquals("cba", st.reverseString("abc"));

        // Test isPalindrome (assuming it returns boolean)
        assertFalse(st.isPalindrome("abc"));
        assertTrue(st.isPalindrome("madam"));

        // Test toUppercase
        assertEquals("ABC", st.toUppercase("abc"));
    }
}
