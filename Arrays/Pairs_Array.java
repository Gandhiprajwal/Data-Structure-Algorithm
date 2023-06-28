package Arrays;

public class Pairs_Array {
    // PAIR UP ALL ELEMENTS OF THE ARRAY
    static void pair_up(int[] arr){
        // TIME COMPLEXITY - O(n^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {25,14,9,5,15,8};
        pair_up(arr);
    }
}
