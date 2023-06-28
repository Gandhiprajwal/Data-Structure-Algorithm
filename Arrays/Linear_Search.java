package Arrays;

public class Linear_Search {
    //LINEAR SEARCH
    public static int linear_search(int[] arr,int key){
        // TIME COMPLEXITY - O(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,8,15,19,22};
        int idx = linear_search(arr, 8);
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
