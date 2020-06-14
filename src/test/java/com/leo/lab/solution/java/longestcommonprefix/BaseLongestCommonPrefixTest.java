package com.leo.lab.solution.java.longestcommonprefix;

import com.leo.lab.question.LongestCommonPrefix;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Leo Lu
 * @since 2020/06/08
 */
public abstract class BaseLongestCommonPrefixTest extends BaseTest<LongestCommonPrefix> {

    @Test
    public void testWithPrefix() {
        // GIVEN
        String[] strs = {"flower", "flow", "flight"};

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("fl", longestCommonPrefix);
    }

    @Test
    public void testWithPrefix2() {
        // GIVEN
        String[] strs = {"flower", "flow"};

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("flow", longestCommonPrefix);
    }

    @Test
    public void testWithPrefix3() {
        // GIVEN
        String[] strs = {"", "", ""};

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("", longestCommonPrefix);
    }

    @Test
    public void testWithoutPrefix() {
        // GIVEN
        String[] strs = {"dog","racecar","car"};

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("", longestCommonPrefix);
    }

    @Test
    public void testEmptyList() {
        // GIVEN
        String[] strs = new String[0];

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("", longestCommonPrefix);
    }

    @Test
    public void testSameStringList() {
        // GIVEN
        String[] strs = {"dogcatmonkey","dogcatmonkey","dogcatmonkey"};

        // WHEN
        String longestCommonPrefix =  tested.longestCommonPrefix(strs);

        // THEN
        Assert.assertEquals("dogcatmonkey", longestCommonPrefix);
    }
}
