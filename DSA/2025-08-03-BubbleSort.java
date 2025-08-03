// optimized bubble sort with early exit

class Main {
    public static void main(String[] args) {
        int[] nums={1,4,7,3,4,4,9,6};
        bubbleSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
    public static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            boolean swap=false;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;   // checking if swap performed or not
                }
            }
            if(swap==false) return;
        }
       
    }
}
