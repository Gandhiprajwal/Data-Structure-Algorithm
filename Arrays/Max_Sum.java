package Arrays;

public class Max_Sum { // Brute force approach
    static int max_Sum(int[] arr) {
        // TIME COMPLEXITY - O(n^3)
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // sub-array sum
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }
        return maxsum;
    }

    // Prefix Sum
    static int max_PrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        //Calculate prefix sum
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            }
            if (maxsum < currSum) {
                    maxsum = currSum;
                }
        }
        return maxsum;
    }

    // Kadane's Algorithm
    static int kadane_sAlgo(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        // int[] arr = {1,-1,6,-1,3};
        // System.out.println("Max Sum is: " + max_Sum(arr));
        // System.out.println(max_PrefixSum(arr));
        int[] arr1 = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadane_sAlgo(arr1));
    }
}
