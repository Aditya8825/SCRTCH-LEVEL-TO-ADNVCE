// public class peakelement {
//     static int search(int []arr,int target){
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
//             int mid=(left+right)/2;

//             if(arr[mid]>arr[mid+1]){
//                 right=mid;
//             }else{
//                 left=mid+1;
//             }
//         }
           
//     }
//     public static void main(String[] args) {
//         int []arr={1,3,8,10,12,9,7,6,5,4,2};
//         int search=search(arr,9);

//     }
// }








//chtgpt
public class MountainSearchEasy {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int target = 4;

        int start = 0;
        int end = arr.length - 1;

        // FIND PEAK ELEMENT
        while (start < end) {

            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int peak = start;

        // SEARCH IN LEFT SIDE (ASCENDING)
        start = 0;
        end = peak;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Index = " + mid);
                return;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // SEARCH IN RIGHT SIDE (DESCENDING)
        start = peak + 1;
        end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Index = " + mid);
                return;
            }

            if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}