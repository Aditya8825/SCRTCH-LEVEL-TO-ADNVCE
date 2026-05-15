// public class NoOfOccurrence {

//     static int firstOccurrence(int[] arr, int target) {

//         int left = 0;
//         int right = arr.length - 1;

//         int ans = -1;

//         while (left <= right) {

//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {

//                 ans = mid;
//                 right = mid - 1;
//             }

//             else if (arr[mid] < target) {

//                 left = mid + 1;
//             }

//             else {

//                 right = mid - 1;
//             }
//         }

//         return ans;
//     }

//     static int lastOccurrence(int[] arr, int target) {

//         int left = 0;
//         int right = arr.length - 1;

//         int ans = -1;

//         while (left <= right) {

//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {

//                 ans = mid;
//                 left = mid + 1;
//             }

//             else if (arr[mid] < target) {

//                 left = mid + 1;
//             }

//             else {

//                 right = mid - 1;
//             }
//         }

//         return ans;
//     }

//     static int countOccurrences(int[] arr, int target) {

//         int first = firstOccurrence(arr, target);

//         if (first == -1) {
//             return 0;
//         }

//         int last = lastOccurrence(arr, target);

//         return last - first + 1;
//     }

//     public static void main(String[] args) {

//         int[] arr = {1,2,2,2,2,3,3,3,4,5,5,5};

//         for (int i = 0; i < arr.length; ) {

//             int count = countOccurrences(arr, arr[i]);

//             if (count > 1) {

//                 System.out.println(
//                     "Element = " + arr[i] +
//                     " -> Occurrence = " + count
//                 );
//             }

//             i = i + count;
//         }
//     }
// }