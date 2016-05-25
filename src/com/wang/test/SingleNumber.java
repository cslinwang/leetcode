package com.wang.test;

/* @tittle: Single Number
 * @auther:wwwglin
 * @time: 2016/0/12
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		//作为结果存储及标识，temp为1表明存在相同两个数，为0标识不存在。
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			temp = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					temp = 1;
					break;
				}
			}
			
			if (temp == 0) {
				temp = nums[i];
				break;
			}

		}
		return temp;
	}

	public static void main(String[] args) {
		int[] a = { 7, 2, 3, 4, 2, 3, 4 };
		System.out.println(new SingleNumber().singleNumber(a));
	}
}
