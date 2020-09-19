package com.guolin.study;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                result = new int[]{map.get(key),i};
                break;
            }
            map.put( nums[i], i);
        }
        return result;
    }

}
