package Arrays;

public class Reverse_Array {
    // REVERSE ARRAY
    static int[] reverse_arr(int[] arr){
        //TIME COMPLEXITY - O(n)
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {25,14,9,5,15,8};
        int[] arr1 = reverse_arr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
