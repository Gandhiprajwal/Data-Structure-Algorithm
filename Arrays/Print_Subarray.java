package Arrays;

public class Print_Subarray {
    // PRINT SUB-ARRAY
    static void sub_array(int[] arr){
        // TIME COMPLEXITY - O(n^3)
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        sub_array(arr);
    }
}
