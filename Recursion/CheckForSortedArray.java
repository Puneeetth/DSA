public class CheckForSortedArray {
    public static int isSorted(int[] A, int index) {
        if (index == 1 || A.length == 1) return 1;

        if (A[index - 1] < A[index - 2]) return 0;

        return isSorted(A, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 4};
        System.out.println(isSorted(arr, arr.length));
    }
}