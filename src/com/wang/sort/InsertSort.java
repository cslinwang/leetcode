package com.wang.sort;
/*
 * @tittle: insertsort
 * @author:wwwglin
 * @time:2016/04.18
 */
public class InsertSort {
	public void insertSort(int[] nums) {
		int temp = 0;
		for (int i = 1; i < nums.length; i++) {
			temp = nums[i];
			int j = i-1;
			while (j >= 0 && temp < nums[j]){
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 49, 38, 65, 97, 76, 13, 27, 49 };
		System.out.println("排序前：");
		for (int i : nums) {
			System.out.print(i + ",");
		}
		new InsertSort().insertSort(nums);
		System.out.println();
		System.out.println("排序后:");		
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}
}
