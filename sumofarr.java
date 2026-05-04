// public class sumaofallelement {
//     public static void main(String[] args) {
//         int []arr={1,2,3,3,5,6};

//         int sum=0;
//         for(int num : arr){
//           sum+=num;
//         }
//         System.out.println("sum:"+sum);
//     }
// }



public class sumofarr{
    static void sumArr(int arr[]){
     int sum=0;
          for(int i=0; i<arr.length; i++){
            sum+=arr[i];
          }
          System.out.println("sum="+sum);
        }
    public static void main(String[] args) {
            int arr[]={9,4,7,36,5};
            sumArr(arr);
          }
    }
