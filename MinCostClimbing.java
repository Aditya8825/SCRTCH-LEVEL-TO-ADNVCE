// // public class mostclimingtree {

// //     static int mincostcliming(int[] cost){
// //         return Math.min (mincost((0,cost),mincost(1,cost)));
// //     }

// //      private static int mincost(int i. int[]cost){
// //         if(i>=cost.length)  return 0;

// //         return cost[i]+Math.min(mincost(i+1,cost),mincost(),mincost(i+2,cost));
// //      }
// //     public static void main(String[] args) {
    
// // }
// // }

// public class MinCostClimbing {

//     static int minCostClimbing(int[] cost) {

//         int first = 0;   // cost to reach step 0
//         int second = 0;  // cost to reach step 1

//         for (int i = 2; i <= cost.length; i++) {

//             int oneStep = second + cost[i - 1];
//             int twoStep = first + cost[i - 2];

//             int current = Math.min(oneStep, twoStep);

//             first = second;
//             second = current;
//         }

//         return second;
//     }

//     public static void main(String[] args) {

//         int[] cost = {10, 15, 20};

//         System.out.println(minCostClimbing(cost));
//     }
// }

