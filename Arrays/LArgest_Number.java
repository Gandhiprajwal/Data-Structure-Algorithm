package Arrays;

public class LArgest_Number {
    // FIND LARGEST NUMBER
    public static int largest_num(int[] arr) {
        int largest = Integer.MIN_VALUE;
        // TIME COMPLEXITY - O(n)
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,88,5};
        System.out.println("Largest Number is: "+largest_num(arr));;
    }
}
