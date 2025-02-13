package BinarySearching;

public class BinarySearch {


    static int binarySearch(int arr[], int target) {
        if (arr == null || arr.length == 0) {
            return -1; // or throw an exception
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}