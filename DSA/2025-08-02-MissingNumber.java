// LeetCode Problem - 268. Missing Number
// description - Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class Solution {
    public int missingNumber(int[] nums) {
        int localSum=0;
        for(int i=0;i<nums.length;i++){
            localSum+=nums[i];
        }
        int actualSum=((nums.length*(nums.length+1)))/2;
        return actualSum-localSum;
    }
}
