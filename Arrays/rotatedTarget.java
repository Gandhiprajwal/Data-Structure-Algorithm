package Arrays;

public class rotatedTarget {
    // rotated array and targeted element by O(logn) --> Binary Search
    public static int rotatedTarget(int[] arr,int target){
        // find the min num in the array
        int min = minSearch(arr);
        // for left sorted array
        if(arr[min] <= target && target <= arr[arr.length-1]){
            return search(arr,min,arr.length-1,target);
        }
        // for right sorted array
        else{
            return search(arr,0,min,target);
        }
    }

    // search
    public static int search(int[] arr,int start,int end,int target){
        int left = start;
        int right = end;
        while (left<=right) {
            int mid = left + (right -left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
    
    // minSearch
    public static int minSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start + (end - start)/2;
            // System.out.println(mid);
            if(mid >0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[start] < arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotatedTarget(arr,3));;
    }
}
