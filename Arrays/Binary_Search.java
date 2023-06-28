package Arrays;

public class Binary_Search {
    // BINARY SEARCH
    static int binary_search(int arr[], int key){
        int start = 0, end = arr.length-1;
        // TIME COMPLEXITY - O(logn)
        while(start<= end){
            int mid = (start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10,16,20};
        int key =20;
        int idx = binary_search(arr, key);
        if(idx == -1){
            // if key is not found
            System.out.println("NOT FOUND!");
        }
        else{
            // if key is found in array
            System.out.println("Key is at index: "+idx);
        }
    }
}
