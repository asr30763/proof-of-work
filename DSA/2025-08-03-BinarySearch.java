// BINARY SEARCH - needs sorted array to work upon
// Tc=  O(log n)

class Main{
    public static void main(String[] str){
        int arr[]={1,2,3,4,5,6,7,8};
        int target=3;
        int result=binarySearch(arr,target);
        if(result>=0)
        System.out.println("element : "+target+" found at index "+ result);
        else System.out.println("not found !");
    }
    public static int binarySearch(int[] nums ,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]==target) return mid;
        else if(target<nums[mid]) right=mid-1;
        else left=mid+1;
        }
        return -1;
    }
}
