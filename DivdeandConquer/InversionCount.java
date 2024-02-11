package DivdeandConquer;

public class InversionCount {
    public static int getInvCount(int[] arr) {
        int invCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static int merge(int[] arr, int si, int mid, int ei) {
        int i = si, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(ei - si + 1)];

        while ((i < mid) && (j <= ei)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                invCount += (mid - 1);
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static int mergeSort(int[] arr, int si, int ei) {
        int invCount = 0;
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            // int mid = (ei + si) / 2;
            invCount = mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid + 1, ei);
            invCount += merge(arr, si, mid + 1, ei);
        }
        return invCount;
    }

    public static int getInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println("Inversion Count: " + getInversions(arr));
    }
}
