#LeetCode - 27   |    Remove Element
#Description - Remove all occurrences of a given value in-place from an array and return the new length.
#Approach - two pointer technique

class Solution {
    public int removeElement(int[] nums, int val) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) nums[pos++]=nums[i];
        }
        return pos;
    }
}
