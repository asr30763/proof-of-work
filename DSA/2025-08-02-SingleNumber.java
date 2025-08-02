// LeetCode Problem- 136. Single Number 
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// linear runtime complexity and use only constant extra space.


class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
      for(int i=0;i<nums.length;i++){
        result^=nums[i];

      }  
      return result;
    }
}
