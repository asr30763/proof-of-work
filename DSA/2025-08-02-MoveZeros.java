// LeetCode - 283. Move Zeroes at last
// inplace ,have to maintain relative order (O(n))

class Solution {
    public void moveZeroes(int[] nums) {
     int p1=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0 && p1==-1) p1=i; // first zero 
        else if(p1!=-1 && nums[i]!=0){
            nums[p1]=nums[i];
            nums[i]=0;
            p1++;
        }
        
     }
    }
}
