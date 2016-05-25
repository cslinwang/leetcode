package com.wang.test;

/* @tittle:292. Nim Game
 * @auther:wwwglin
 * @time: 2016/04/11
 */
public class NimGame {
	    public boolean canWinNim(int n) {
	        return n % 4 != 0;
	    }
	public static void main(String[] args) {
		System.out.println(new NimGame().canWinNim(7));
	}
}
