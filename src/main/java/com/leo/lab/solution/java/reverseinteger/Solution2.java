package com.leo.lab.solution.java.reverseinteger;

import com.leo.lab.question.ReverseInteger;

/**
 * @author Leo Lu
 * @since 2020/06/06
 */
public class Solution2 implements ReverseInteger {

    private static int MAX_BASE = Integer.MAX_VALUE / 10;
    private static int MIN_BASE = Integer.MIN_VALUE / 10;
    private static int MAX_INCREMENT = Integer.MAX_VALUE % 10;
    private static int MIN_REDUCTION = Integer.MIN_VALUE % 10;

    @Override
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            // Max integer is 2147483647
            if (rev > MAX_BASE || rev == MAX_BASE && pop > MAX_INCREMENT) {
                return 0;
            }
            // Minimum integer is -2147483648
            if (rev < MIN_BASE || rev == MIN_BASE && pop < MIN_REDUCTION) {
                return 0;
            }
            rev = rev * 10 + pop;
            x = x / 10;
        }
        return rev;
    }
}
