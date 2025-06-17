
public class TwoSortedArray {

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

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 7, 8, 11, 15, 16, 23 };
        int[] arr2 = { 2,  6, 7, 9, 10, 11 };
        int[] result = MergeSort(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
