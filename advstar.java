// public class advstar{
//     public static void main(String[] args) {
//         int n = 5;

//         // Upper half
//         for (int i = 1; i <= n; i++) {

//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             // Increasing numbers
//             int num = i;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }

//             // Decreasing numbers
//             num = num - 2;
//             for (int j = 1; j < i; j++) {
//                 System.out.print(num + " ");
//                 num--;
//             }

//             System.out.println();
//         }

//         // Lower half
//         for (int i = n - 1; i >= 1; i--) {

//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             // Increasing numbers
//             int num = i;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }

//             // Decreasing numbers
//             num = num - 2;
//             for (int j = 1; j < i; j++) {
//                 System.out.print(num + " ");
//                 num--;
//             }

//             System.out.println();
//         }
//     }
// }