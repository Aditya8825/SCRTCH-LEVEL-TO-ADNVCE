public class largestelement {
    static int largest(int[]arr){
        for(int j=0; j<arr.length-1; j++){
         
            if(arr[j]>arr[j+1]){

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        return arr[arr.length-1];
       
    
}
   public static void main(String[] args) {
    int []arr={5,3,8,1,2};
  System.out.println("largest => "+largest(arr));
   }
}