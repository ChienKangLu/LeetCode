package com.leo.lab.solution.java.romantointeger;

import com.leo.lab.question.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public class Solution implements RomanToInteger {

    private static final Character I = 'I';
    private static final int I_VALUE = 1;
    private static final Character V = 'V';
    private static final int V_VALUE = 5;
    private static final Character X = 'X';
    private static final int X_VALUE = 10;
    private static final Character L = 'L';
    private static final int L_VALUE = 50;
    private static final Character C = 'C';
    private static final int C_VALUE = 100;
    private static final Character D = 'D';
    private static final int D_VALUE = 500;
    private static final Character M = 'M';
    private static final int M_VALUE = 1000;
    private static final Map<Character, Integer> ROMAN_MAP = new HashMap<>();

    static {
        ROMAN_MAP.put(I, I_VALUE);
        ROMAN_MAP.put(V, V_VALUE);
        ROMAN_MAP.put(X, X_VALUE);
        ROMAN_MAP.put(L, L_VALUE);
        ROMAN_MAP.put(C, C_VALUE);
        ROMAN_MAP.put(D, D_VALUE);
        ROMAN_MAP.put(M, M_VALUE);
    }

    @Override
    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int lastIndex = s.length() - 1;
        Integer lastValue = ROMAN_MAP.get(s.charAt(lastIndex));
        if (lastValue == null) {
            return 0;
        }
        int sum = lastValue;
        for (int i = lastIndex - 1; i >= 0; i--) {
            char current = s.charAt(i);
            char next = s.charAt(i + 1);
            Integer currentValue = ROMAN_MAP.get(current);
            Integer nextValue = ROMAN_MAP.get(next);
            if (currentValue == null || nextValue == null) {
                return 0;
            }
            if (currentValue < nextValue) {
                currentValue *= -1;
            }
            sum += currentValue;
        }
        return sum;
    }
}
