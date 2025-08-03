// LeetCode Problem - 2089. Find Target Indices After Sorting Array
// Return a list of the target indices of nums after sorting nums in non-decreasing order. 
//If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

import java.util.ArrayList;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int count=0;int small=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target) count++;
        if(nums[i]<target) small++;
       }
       ArrayList<Integer> list = new ArrayList<>();
       while(count>0){
        list.add(small++);
        count--;
       }
       return list;
    }
}
