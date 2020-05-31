package com.leo.lab.solution.java.twosum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Leo Lu
 * @since 2020/05/31
 */
public class TwoSumTest {

    @Before
    public void setUp() {
        // Do nothing
    }

    @Test
    public void testSolution() {
        // GIVEN
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // WHEN
        Solution solution = new Solution();
        int[] indices = solution.twoSum(nums, target);

        // THEN
        assertArrayEquals(new int[]{0, 1}, indices);
    }
}
