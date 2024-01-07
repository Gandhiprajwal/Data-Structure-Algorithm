package LeetCode;

import java.util.HashMap;

public class subarraySum {
    public static int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int maxArray = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum == k) {
                maxArray = Math.max(maxArray,i+1);
            }
            if (map.containsKey(currSum - k)) {
                maxArray = Math.max(maxArray,i-map.get(currSum-k));
            }
            if(!map.containsKey(currSum)){
                map.put(currSum, i);
            }
        }
        System.out.println(map);
        if(maxArray == Integer.MIN_VALUE) return 0;
        // System.out.println(map);
        return maxArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int res = subarraySum(arr,2);
        System.out.println(res);
    }
}

// int start = 0;
//         int end = -1;
//         int currSum = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             currSum += nums[i];
//             if (currSum - k == 0) {
//                 start = 0;
//                 end = i;
//                 break;
//             }
//             if (map.containsKey(currSum - k)) {
//                 start = map.get(currSum - k) + 1;
//                 end = i;
//                 // return end - start;
//                 break;
//             }
//             map.put(currSum, i);
//         }
//         System.out.println(map);
//         return (end - start) + 1;