// LeetCode Problem -485. Max Consecutive Ones
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;int temp=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1) temp++;
        else{
            if(temp>count) count=temp;
            temp=0;
        }
     }
     if(temp>count) count=temp;
     return count;   
    }
}
