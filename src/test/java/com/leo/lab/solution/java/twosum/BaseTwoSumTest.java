package com.leo.lab.solution.java.twosum;

import com.leo.lab.question.TwoSum;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Leo Lu
 * @since 2020/05/31
 */
public abstract class BaseTwoSumTest extends BaseTest<TwoSum> {

    @Test
    public void testSolution() {
        // GIVEN
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // WHEN
        int[] indices = tested.twoSum(nums, target);

        // THEN
        assertArrayEquals(new int[]{0, 1}, indices);
    }
}
