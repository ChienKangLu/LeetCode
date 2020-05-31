package com.leo.lab.solution.java.twosum;

import com.leo.lab.question.TwoSum;

import java.util.HashMap;

/**
 * @author Leo Lu
 * @since 2020/05/31
 */
public class Solution implements TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int remainder = target - current;
            Integer remainderIndex = map.get(remainder);
            if (remainderIndex != null) {
                return new int[]{remainderIndex, i};
            }
            map.put(current, i);
        }
        return new int[2];
    }
}
