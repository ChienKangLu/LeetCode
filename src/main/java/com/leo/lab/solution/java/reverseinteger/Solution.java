package com.leo.lab.solution.java.reverseinteger;

import com.leo.lab.question.ReverseInteger;

/**
 * @author Leo Lu
 * @since 2020/06/03
 */
public class Solution implements ReverseInteger {

    @Override
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE - 6 || x < Integer.MIN_VALUE + 7) {
            return 0;
        }

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        String xString = String.valueOf(x);
        int length = xString.length();
        int reversed = 0;
        for (int i = 0; i < length;  i++) {
            char c = xString.charAt(i);
            double increase = (c - '0') * Math.pow(10, i);
            if (isNotOverflow(reversed, increase)) {
                reversed += increase;
            } else {
                return 0;
            }
        }
        return isNegative ? reversed * -1 : reversed;
    }

    private boolean isNotOverflow(int current, double increase) {
        int remainder = Integer.MAX_VALUE - current;
        return increase <= remainder;
    }
}

