// BINARY SEARCH - needs sorted array to work upon
// Tc=  O(log n)
//❌ Disadvantages:
///Can lead to StackOverflowError for large arrays (Java's default stack depth is limited).
//Slight overhead of recursive function calls

class Main{
    public static void main(String[] str){
        int arr[]={1,2,3,4,5,6,7,8};
        int target=8;
        int result=binarySearch(arr,target,0,arr.length-1);
        if(result>=0)
        System.out.println(target+" found at index "+ result);
        else System.out.println("not found !");
    }
    public static int binarySearch(int[] nums ,int target,int left,int right){
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return binarySearch(nums,target,left,mid-1);
        else return binarySearch(nums,target,mid+1,right);
     
    }
}
