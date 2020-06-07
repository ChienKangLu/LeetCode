package com.leo.lab.solution.java.palindromenumber;

import com.leo.lab.question.PalindromeNumber;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public class Solution implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0 || x > 0 && x % 10 == 0) {
            return false;
        }

        int xVar = x;
        long rev = 0;
        while (xVar != 0) {
            int digit = xVar % 10;
            rev = rev * 10 + digit;
            xVar /= 10;
        }
        return rev == x;
    }
}
