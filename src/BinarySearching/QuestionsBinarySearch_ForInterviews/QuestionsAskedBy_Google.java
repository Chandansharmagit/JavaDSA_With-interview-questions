package BinarySearching.QuestionsBinarySearch_ForInterviews;

import java.util.Scanner;

//finding the ceiling of the array

public class QuestionsAskedBy_Google {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        int ans = findingCeilling(arr, target);
        //finding the last index value of given array
        int lastindexvalue = arr.length -1;
        int value = arr[lastindexvalue];
        try {
            if (ans != -1) {
                System.out.println("Ceiling of the target is: " + arr[ans]);
            } else {
                System.out.println("No ceiling found for the target.");
            }

        } catch (Exception e) {
            System.out.println("sorry this element is not found in given array : " + target + " you have to enter any Random number i.e less than or equal to " + value);
        }


    }

    static int findingCeilling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start;
    }
}
