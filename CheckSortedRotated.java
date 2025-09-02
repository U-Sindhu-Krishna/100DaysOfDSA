public class CheckSortedRotated {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
            if (count > 1)
                return false;
        }
        return count == 1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 5, 1, 2 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = { 3, 5, 4, 1, 2 };

        System.out.println("Array 1 sorted & rotated? " + isSortedAndRotated(arr1));
        System.out.println("Array 2 sorted & rotated? " + isSortedAndRotated(arr2));
        System.out.println("Array 2 sorted & rotated? " + isSortedAndRotated(arr3));
    }
}
