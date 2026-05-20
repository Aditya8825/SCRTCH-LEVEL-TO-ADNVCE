// public class countnumberofshift {
//     static int insertionsort(int[]arr){
//         int shifts=0;

//         for(int i=1; i<arr.length; i++){


//             int key=arr[i];
//             int j=i-1;



//             while(j>=0 && arr[j]>key){
//              arr[j+1]=arr[j];
//              j--;
//              shifts++;

//             }
//             arr[j+1]=key;
//         }
//         return shifts;
//     }
//     public static void main(String[] args) {
//         int[]arr={2,1,3,1,2};
//         int result=insertionsort(arr);
//         System.out.println("number of shifts: "+result);

//     }
// }
