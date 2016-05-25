package com.wang.test;

/*
 * @tittle:258. Add Digits
 * @auther:wwwglin
 * @time:2016/4/12
 */
public class AddDigits {
	public int addDigits(int num) {
		int sum = 0;
		String numString = String.valueOf(num);
		char[] numCharArray = numString.toCharArray();
		for (int i = 0; i < numCharArray.length; i++) {
			sum += Integer.parseInt(String.valueOf(numCharArray[i]));
		}
		if (sum >= 10) {
			return addDigits(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new AddDigits().addDigits(67));
	}
}
