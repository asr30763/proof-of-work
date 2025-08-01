// Problem: Leetcode 26 - Remove Duplicates from Sorted Array
// Approach: Two Pointers - O(n) time, O(1) space

class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) nums[++pos]=nums[i];
        }
        return pos+1;
    }
}
