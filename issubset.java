// import java.util.HashMap;

// public class issubset {

//     public boolean isSubset(int a[], int b[]) {

//         // Store frequency of elements of array a
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int ele : a) {
//             if (map.containsKey(ele)) {
//                 int freq = map.get(ele);
//                 map.put(ele, freq + 1);
//             } else {
//                 map.put(ele, 1);
//             }
//         }

//         // Check every element of b
//         for (int ele : b) {

//             // Element not present in a
//             if (!map.containsKey(ele)) {
//                 return false;
//             }

//             int freq = map.get(ele);

//             // Frequency exhausted
//             if (freq == 0) {
//                 return false;
//             }

//             map.put(ele, freq - 1);
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         int a[] = {1, 2, 3, 4, 5, 2};
//         int b[] = {2, 3, 2};

//         issubset obj = new issubset();

//         System.out.println(obj.isSubset(a, b));
//     }
// }