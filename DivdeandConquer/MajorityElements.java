package DivdeandConquer;

public class MajorityElements {

    public static int countInRange(int[] arr, int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int[] arr, int si, int ei) {
        // the only element in an array in an array of size 1 is the majority element
        if (si == ei) {
            return arr[si];
        }

        // recurse on left and right halves of this slice.
        int mid = si + (ei - si) / 2;
        int left = majorityElementRec(arr, si, mid);
        int right = majorityElementRec(arr, mid + 1, ei);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(arr, left, si, ei);
        int rightCount = countInRange(arr, right, si, ei);

        return leftCount > rightCount ? left : right;

    }

    public static int majorityElement(int[] arr) {
        return majorityElementRec(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,1};
        System.out.println(majorityElement(nums));
    }
}
