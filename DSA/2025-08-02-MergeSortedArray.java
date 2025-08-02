// LeetCode Problem - 88. Merge Sorted Array
// nums1,nums2 -> sorted & non decreasing order
// inplace 


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1=m-1;int p2=n-1;int p3=m+n-1;
      while(p1>=0 && p2>=0){
        if(nums1[p1]>nums2[p2]){
             nums1[p3--]=nums1[p1];
             nums1[p1--]=0;
        }
        else{
            nums1[p3--]=nums2[p2--];
        }
      }
       while (p2 >= 0) {    // if nums1 exhausted early 
            nums1[p3--] = nums2[p2--];
        }
    } // we didnt need to think if nums2 exhausted early , then nums1 by default will be ok
}
