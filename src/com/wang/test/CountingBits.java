package com.wang.test;

import java.util.ArrayList;
import java.util.List;

/* @Tittle
 * 338. Counting Bits
 * Given a non negative integer number num. 
 * For every numbers i in the range 0 ≤ i ≤ num 
 * calculate the number of 1's in their binary representation and return them as an array.
 * @auther:wanglin
 * @time:2016/04/11
 */
public class CountingBits {
	public int[] countBits(int num) {
		List list = new ArrayList();
		for (int n = 0; n <= num; ++n) {
			// binaryNum接收转为二进制的数字
			String binaryNum = Integer.toBinaryString(n);
			char[] charArr = binaryNum.toCharArray();
			int i = 0;
			for (int m = 0; m < charArr.length; ++m) {
				if (charArr[m] == '1') {
					i++;
				}
			}
			list.add(i);
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			res[i] = (Integer) list.get(i);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] res = new CountingBits().countBits(5);
		for (int i : res) {
			System.out.print(i);
		}
	}
}
