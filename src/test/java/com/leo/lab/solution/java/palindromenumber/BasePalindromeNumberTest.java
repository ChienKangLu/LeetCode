package com.leo.lab.solution.java.palindromenumber;

import com.leo.lab.question.PalindromeNumber;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public abstract class BasePalindromeNumberTest extends BaseTest<PalindromeNumber> {

    @Test
    public void testNegativeNumber() {
        // GIVEN
        int input = -121;

        // WHEN
        boolean isPalindrome = tested.isPalindrome(input);

        // THEN
        assertFalse(isPalindrome);
    }

    @Test
    public void testNumberInMultiplesOfTen() {
        // GIVEN
        int input = 1310;

        // WHEN
        boolean isPalindrome = tested.isPalindrome(input);

        // THEN
        assertFalse(isPalindrome);
    }

    @Test
    public void testPalindromeNumber() {
        // GIVE
        int input = 121;

        // WHEN
        boolean isPalindrome = tested.isPalindrome(input);

        // THEN
        assertTrue(isPalindrome);
    }
}
