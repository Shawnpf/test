package com.leetcode;

/**

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 * Created by shangpengfei on 2017/5/11.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i+1] == target) {
                int[] ret = new int[2];
                ret[0] = i;
                ret[1] = i+1;
                return ret;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{11,2,7,13};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] su = twoSum.twoSum(nums, target);
        System.out.println(su.toString());
    }
}

    /*public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }*/