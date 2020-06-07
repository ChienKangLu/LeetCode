package com.leo.lab.solution.java.romantointeger;

import com.leo.lab.question.RomanToInteger;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public abstract class BaseRomanToIntegerTest extends BaseTest<RomanToInteger> {

    @Test
    public void testIII() {
        // GIVEN
        String input = "III";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(3, output);
    }

    @Test
    public void testIV() {
        // GIVEN
        String input = "IV";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(4, output);
    }

    @Test
    public void testIX() {
        // GIVEN
        String input = "IX";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(9, output);
    }

    @Test
    public void testLVIII() {
        // GIVEN
        String input = "LVIII";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(58, output);
    }

    @Test
    public void testMCMXCIV() {
        // GIVEN
        String input = "MCMXCIV";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(1994, output);
    }

    @Test
    public void testII() {
        // GIVEN
        String input = "II";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(2, output);
    }

    @Test
    public void testXII() {
        // GIVEN
        String input = "XII";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(12, output);
    }

    @Test
    public void testXXVII() {
        // GIVEN
        String input = "XXVII";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(27, output);
    }

    @Test
    public void testNull() {
        // GIVEN
        String input = null;

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(0, output);
    }

    @Test
    public void testEmptyString() {
        // GIVEN
        String input = "";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(0, output);
    }

    @Test
    public void testInvalidCharacter() {
        // GIVEN
        String input = "AXXVII";

        // WHEN
        int output = tested.romanToInt(input);

        // THEN
        Assert.assertEquals(0, output);
    }
}
