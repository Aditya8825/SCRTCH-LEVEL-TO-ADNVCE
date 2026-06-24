




// // Dynamic Programming - Fibonacci (Memoization)

// public class fibo {

//     static int[] dp;

//     static int fibo(int n) {

//          // base case
//         if (n <= 1) {
//             return n;
//         }
 
// //if already calculated
//         if (dp[n] != 0) {
//             return dp[n];
//         }
//         //store ans in dp fromat

//         int ans = fibo(n - 1) + fibo(n - 2);

//         dp[n] = ans;

//         return ans;
//     }

//     static int nthfibo(int n) {

//         dp = new int[n + 1];

//         return fibo(n);
//     }

//     public static void main(String[] args) {

//         int n = 10;

//         System.out.println("Fibonacci of " + n + " = " + nthfibo(n));
//     }
// }