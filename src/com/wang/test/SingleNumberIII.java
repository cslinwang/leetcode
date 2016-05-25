package com.wang.test;

/*
 * @tittle:260. Single Number III
 * @author:wwwglin
 * @time:2016/04/18
 */
public class SingleNumberIII {
	//任何数字异或自身都为0
	public int[] singleNumber(int[] nums) {
		int resTwo = 0;
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			resTwo ^= nums[i];
		}
		// find the rigthest bit which is not 0
		resTwo &= -resTwo;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & resTwo) == 0) {
				res[0] ^= nums[i];
			} else {
				res[1] ^= nums[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5, 7, 2, 4, 1, 7, 5 };
		int[] res = new SingleNumberIII().singleNumber(nums);
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
