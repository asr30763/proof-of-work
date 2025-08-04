// Insertion Sort
// worst and avg case O(n^2)
//best case O(n) - if array is already sorted



class Main {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,5};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i : arr){
            System.out.print(i+"  ");
        }
    }
}
