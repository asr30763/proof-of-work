// Selection sort

class Main {
    public static void main(String[] args) {
        int[] nums={1,4,7,3,4,4,9,6};
        selectionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
    public static void selectionSort(int[] nums){
     for(int i=0;i<nums.length;i++){
        int min=i;
         for(int j=i+1;j<nums.length;j++){
             if(nums[j]<nums[min]){ 
                 min=j;
             }
         }
         // swap if found smaller number 
         if(min!=i){
         int temp=nums[i];
         nums[i]=nums[min];
         nums[min]=temp;
         }
         
     }
       
    }
}
