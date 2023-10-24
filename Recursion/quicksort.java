public class quicksort {
    public static void quick(int arr[],int low,int high){
        if(low<high){
       
        int index=indexer( arr,low , high);
        quick(arr, low, index-1);
        quick(arr, index+1, high);
    }
}

    private static int indexer(int[] arr, int low, int high) {
         int pivot=arr[low];
         int i=low;
         int j=high;
         while(i<j){
            while(arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while(arr[j]>pivot&&j>=low+1){
                j--;
            }
            if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
        }
        int temp=arr[j];
            arr[j]=arr[low];
            arr[low]=temp;

        return j;
    }
    public static void main(String args[]){
        int arr[]={5,4,2,1,65};
        quick(arr, 0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
