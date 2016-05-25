package com.wang.test;

/*
 * Title:283. Move Zeroes
 * @auther:wwwglin
 * @time:2016/04/14
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int i=0;  
        int j=0;  
        while(j<nums.length) {  
            if(nums[j]!=0) {  
               if(j!=i) {   
                    nums[i++] = nums[j];  
                    nums[j] = 0;  
               } else {  
                   ++i;  
               }  
            }   
            ++j;  
        }  

	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1 };
		System.out.print("old: ");
		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.print("new: ");
		new MoveZeroes().moveZeroes(nums);
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}
}
