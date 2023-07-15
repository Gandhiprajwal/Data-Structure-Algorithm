package Sorting_Algorithm;

class Sorting_Algorithms{
    // Time Complexity - O(n^2)
    static void bubbleSort(int[] arr){
        int swap = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                // System.out.println(swap);
                return;
            }
        }
    }

    static void selection_Sort(int[] arr){
        //Time Complexity - O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertion_Sort(int[] arr){
        // Time Complexity - O(n^2)
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //find out correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    static void counting_Sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // print arr
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        int[] arr1 = {1,4,1,3,2,4,3,7};
        // bubbleSort(arr);
        // selection_Sort(arr);
        // insertion_Sort(arr);
        counting_Sort(arr1);
        printArr(arr1);
    }
}