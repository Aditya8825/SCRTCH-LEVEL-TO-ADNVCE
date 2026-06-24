// public class nthfibo{
//     public int nthfib(int n){
//         // base case
//         if(n==0) return 0;

//         if(n==1) return 1;
//         //dp array
//         //int []dp= new int[n=1];


//         int[] dp= new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         //fill  the dp
//         for(int i=2; i<=n; i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// public static void main(String[] args) {
//     nthfibo obj = new nthfibo();
//     int n=2;
//     System.out.println(obj.nthfib(n));
    
// }
// }