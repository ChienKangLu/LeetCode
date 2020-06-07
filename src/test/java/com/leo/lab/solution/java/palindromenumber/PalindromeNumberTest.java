package com.leo.lab.solution.java.palindromenumber;

import com.leo.lab.question.PalindromeNumber;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public class PalindromeNumberTest extends BasePalindromeNumberTest {

    @Override
    protected PalindromeNumber initializeTestedSolution() {
        return new Solution();
    }
}
