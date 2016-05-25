package com.wang.sort;
/*
 * @tittle:	bubbleSort
 * @author:	wwwglin
 * @time 2016/04/20
 */

/*
 * 思路：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 	         然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * 时间复杂度：
 * 			最好：O（nlog2n）
 * 			最坏：O（n^2）
 * 			平均：O（nlog2n）
 * 空间复杂度：O（log2n）
 */
		
public class QuickSort {

	public static void quickSort(int[] array) {
		if (array != null) {
			quickSort(array, 0, array.length - 1);
		}
	}

	private static void quickSort(int[] array, int beg, int end) {
		if (beg >= end || array == null)
			return;
		int p = partition(array, beg, end);
		quickSort(array, beg, p - 1);
		quickSort(array, p + 1, end);
	}

	private static int partition(int[] array, int beg, int end) {
		int last = array[end];
		int i = beg - 1;
		for (int j = beg; j <= end - 1; j++) {
			if (array[j] <= last) {
				i++;
				if (i != j) {
					//不使用额外内存交换两个值，异或运算，同为0 异为1
					array[i] = array[i] ^ array[j];
					array[j] = array[i] ^ array[j];
					array[i] = array[i] ^ array[j];
				}
			}
		}
		if ((i + 1) != end) {
			array[i + 1] = array[i + 1] ^ array[end];
			array[end] = array[i + 1] ^ array[end];
			array[i + 1] = array[i + 1] ^ array[end];
		}
		return i + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 49, 38, 65, 97, 76, 13, 27, 49 };
		System.out.println("排序前：");
		for (int i : nums) {
			System.out.print(i + ",");
		}
		quickSort(nums);
		System.out.println();
		System.out.println("排序后:");
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}
	//just test
}
