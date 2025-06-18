public class MergeSort {

    public static int[] MergeSort(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < m) {
            result[k++] = arr1[i++];
        }

        while (j < n) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        int k = 0;
        for (int i = start; i <= mid; i++) {
            left[k++] = arr[i];
        }

        k = 0;
        for (int i = mid + 1; i <= end; i++) {
            right[k++] = arr[i];
        }

        int[] result = MergeSort(left, right);
        k = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = result[k++];
        }

    }

    public static void f(int[] arr, int start, int end) {
        if (end <= start)
            return;
        int mid = (start + end) / 2;

        f(arr, start, mid);
        f(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void mergeSort(int[] arr) {
        f(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, -1, 5, 9, 8, 0 };
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
