package com.wang.sort;

/*
 * @tittle:	bubbleSort
 * @author:	wwwglin
 * @time 2016/04/20
 */

/*
 * 思路：重复的遍历要排序的数组，每次遍历过程中从头至尾比较两个相邻的元素，若顺序错误则交换两个元素。
 * 冒泡排序算法结束的条件：在一趟排序过程中没有发生元素交换
 * 时间复杂度：
 * 			最坏：O（n^2）
 * 			最好：O（n）
 * 			平均:O(n^2)
 * 空间复杂度：O（1）
 */
public class BubbleSort {
	public void bubbleSort(int[] nums) {
		System.out.println(nums.length);
		for (int i = nums.length; i >= 2; i--) {
			int flag = 0;
			for (int j = 1; j < i; j++) {
				if (nums[j] < nums[j - 1]) {
					nums[j - 1] = nums[j - 1] ^ nums[j];
					nums[j] = nums[j - 1] ^ nums[j];
					nums[j - 1] = nums[j - 1] ^ nums[j];
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 49, 38, 65, 97, 76, 13, 27, 49 };
		System.out.println("排序前：");
		for (int i : nums) {
			System.out.print(i + ",");
		}
		new BubbleSort().bubbleSort(nums);
		System.out.println();
		System.out.println("排序后:");
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}
}
