public class MergeSort {

    // STEP 4:
    // This function merges two sorted halves into one sorted array
    static void merge(int[] arr, int start, int mid, int end) {

        // STEP 4.1:
        // Create temporary array to store merged elements
        int[] temp = new int[end - start + 1];

        // STEP 4.2:
        // Starting index of left half
        int i = start;

        // STEP 4.3:
        // Starting index of right half
        int j = mid + 1;

        // STEP 4.4:
        // Index for temporary array
        int k = 0;

        // STEP 4.5:
        // Compare elements from both halves
        while (i <= mid && j <= end) {

            // STEP 4.6:
            // If left element is smaller
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }

            // STEP 4.7:
            // If right element is smaller
            else {
                temp[k] = arr[j];
                j++;
            }

            // STEP 4.8:
            // Move temp array index forward
            k++;
        }

        // STEP 4.9:
        // Copy remaining left half elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // STEP 4.10:
        // Copy remaining right half elements
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // STEP 4.11:
        // Copy sorted temp array back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    // STEP 1:
    // Function to divide array recursively
    static void mergeSort(int[] arr, int start, int end) {

        // STEP 1.1:
        // Base condition
        // If array has only one element, return
        if (start >= end) {
            return;
        }

        // STEP 2:
        // Find middle index
        int mid = start + (end - start) / 2;

        // STEP 3.1:
        // Divide left half
        mergeSort(arr, start, mid);

        // STEP 3.2:
        // Divide right half
        mergeSort(arr, mid + 1, end);

        // STEP 4:
        // Merge both sorted halves
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {

        // STEP 0:
        // Create input array
        int[] arr = {5, 2, 8, 1, 3, 7, 6, 4};

        // STEP 0.1:
        // Call merge sort function
        mergeSort(arr, 0, arr.length - 1);

        // STEP 5:
        // Print sorted array
        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}