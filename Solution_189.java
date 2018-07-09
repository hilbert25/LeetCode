package com.hilbert25.leetcode;
public class Solution_189 {
    public  void rotate(int[] nums, int k) {
  	     k=k%nums.length;
  	     int n=nums.length;
         nums=exchange(nums,0,n-k-1);
         nums=exchange(nums,n-k,n-1);
         nums=exchange(nums,0,n-1);
  }
  public static int []exchange(int[] nums,int begin,int end){
    while(end>begin){
    	nums[begin]=nums[begin]^nums[end];
    	nums[end]=nums[end]^nums[begin];
    	nums[begin]=nums[begin]^nums[end];
    	begin++;
    	end--;
    }
    return nums;
  } 
}