// import java.util.*;


// public class stickler {
//     public int findmaxsum(int arr[]){
//         return   lootkamal(0,arr);
//     }
//     private int lootkamal(int i,int []arr){
//         if(i>=arr.length) return 0;
//         int pickhhouse = arr[i]+lootkamal(i+2,arr);
//         int skiphouse = lootkamal(i+1,arr);
//         return Math.max(pickhhouse,skiphouse);
//     }
//     public static void main(String[] args) {
//         int arr[]={5,5,110,10,50};

//         stickler  obj = new stickler();
//          int ans=obj.findmaxsum(arr);
//         System.out.println(" maximum loot "+ans);
        
//     }
// }



// //optimse version  for dp 
// public class stickler{
//     static int[]dp;
//     public int findmaxsum(int arr[]){
//         int n=arr.length;
//         dp=new int[n];

//         Arrays.fill(arr,-1);
//         return loot(0,arr);
//     }
//     private int loot(int i, int[]arr){
//         if(i>=arr.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int pick=arr[i]+loot(i+2,arr);
//         int skip=Math.max(pick,skip);
//         dp[i]=ans;
//         return ans;
//     }
// }