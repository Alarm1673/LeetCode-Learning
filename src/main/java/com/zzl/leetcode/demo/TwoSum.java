package com.zzl.leetcode.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzilong
 * @date 2021/1/7 2:52 下午
 * @Description
 * 问题：定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 *
 *
 * 思路：首先循环数组，将不满足的元素放入一个map中，key为元素，value为下标；判断数组中是否有满足target-key的值，如果有则表示找到了，取对应的元素和下标就可以
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,35,5,6,8,9};
        int target = 8;
        twoSumNum(nums, target);
    }


    private static void twoSumNum(int[] nums, int target){
        Map<Integer,Integer> result = new HashMap<>();
        Map<Integer,Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (data.containsKey(target - nums[i])){
                result.put(nums[i], i);
                result.put(target - nums[i], data.get(target - nums[i]));
            }else {
                data.put(nums[i], i);
            }
        }
        System.out.println(result);
    }
}
