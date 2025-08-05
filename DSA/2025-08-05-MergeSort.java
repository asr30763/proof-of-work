//Merge Sort
// Time Complexity=O(nlogn) || Merge sort gives consistent performance across all cases(best,avg,best), unlike quicksort.
//Space Complexity=O(n)  || Because of these auxiliary arrays, Merge Sort is not in-place. (leftArr & rightArr)



class Main{
    /// merge sort
    public static void main(String[] args){
         int arr[]={3,5,7,8,9,68};
         divide(arr,0,arr.length-1);
         for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
         }
    }
    public static void divide(int[] arr, int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            divide(arr,left,mid);
            divide(arr,mid+1,right);
            
            merge(arr,left,mid,right);
        }
    }
    
    public static void merge(int[] arr, int left,int mid,int right){
        int[] leftArr= new int [mid-left+1];
        int[] rightArr=new int[right-mid];
        
        for(int i=0;i<leftArr.length;i++){
            leftArr[i]=arr[left+i];
        }
        
        
        for(int i=0;i<rightArr.length;i++){
            rightArr[i]=arr[mid+1+i];
        }
        
        int i=0;
        int j=0;
        int k=left;
        
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]) arr[k++]=leftArr[i++];
            else arr[k++]=rightArr[j++];
            
        }
        
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
        }
        
        while(j<rightArr.length){
            arr[k++]=rightArr[j++];
        }
        
    }

}
