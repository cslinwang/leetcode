package com.wang.test;
/*
 * @tittle:344. Reverse String
 * @author:wwwglin
 * @time:2014/4/22
 */
public class ReverseString {
	public String reverseString(String s) {
		System.out.println(s);
		char[] a = s.toCharArray();
		int l = a.length;
		for (int i = 0; i < l; i++) {
			if (l - i <= i) {
				break;
			}
			char temp = a[i];
			a[i] = a[l - i - 1];
			a[l - i - 1] = temp;
		}
		String rs = String.valueOf(a);
		
		return rs;
	}

	public static void main(String[] args) {
		System.out.println(new ReverseString().reverseString("wang"));
	}
}
