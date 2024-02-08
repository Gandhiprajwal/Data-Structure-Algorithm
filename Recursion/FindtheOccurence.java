package Recursion;

public class FindtheOccurence {
    public static void numberOccurence(int[] arr,int n,int key){
        if(n==arr.length){
            return;
        }
        if(key==arr[n]){
            System.out.print(n+" ");
        }
        numberOccurence(arr, n+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        numberOccurence(arr, 0, 2);
    }
}
