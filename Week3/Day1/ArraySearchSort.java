// Week3 Day1 - Searching and Sorting in Arrays

import java.util.Scanner;

public class ArraySearchSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.print("Original Array: ");
        printArray(arr);

        // Sorting
        bubbleSort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);

        // Searching
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int linearResult = linearSearch(arr, key);
        int binaryResult = binarySearch(arr, key);

        System.out.println("Linear Search Result: " +
            (linearResult == -1 ? "Not Found" : "Found at index " + linearResult));
        System.out.println("Binary Search Result: " +
            (binaryResult == -1 ? "Not Found" : "Found at index " + binaryResult));

        sc.close();
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search (for sorted array)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Utility method
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
