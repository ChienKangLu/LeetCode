package com.leo.lab.solution.java.reverseinteger;

import com.leo.lab.question.ReverseInteger;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Leo Lu
 * @since 2020/06/03
 */
public abstract class BaseReverseIntegerTest extends BaseTest<ReverseInteger> {

    @Test
    public void testPositiveInteger() {
        // GIVEN
        int input = 123;

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(321, output);
    }

    @Test
    public void testNegativeInteger() {
        // GIVEN
        int input = -123;

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(-321, output);
    }

    @Test
    public void testPositiveIntegerEndOfZero() {
        // GIVEN
        int input = 120;

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(21, output);
    }

    @Test
    public void testLargePositiveInteger() {
        // GIVEN
        int input = Integer.MAX_VALUE - 6; // 2147483641

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(1463847412, output);
    }

    @Test
    public void testSmallNegativeInteger() {
        // GIVEN
        int input = Integer.MIN_VALUE + 7; // -2147483641

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(-1463847412, output);
    }

    @Test
    public void testMaximumInteger() {
        // GIVEN
        int input = Integer.MAX_VALUE; // 2147483647

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(0, output);
    }

    @Test
    public void testMinimumInteger() {
        // GIVEN
        int input = Integer.MIN_VALUE; // -2147483648

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(0, output);
    }

    @Test
    public void testOverflow() {
        // GIVEN
        int input = 1534236469;

        // WHEN
        int output = tested.reverse(input);

        // THEN
        assertEquals(0, output);
    }
}
