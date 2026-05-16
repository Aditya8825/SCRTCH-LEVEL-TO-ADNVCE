public class pushzeotoend {
    static void pushzero(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
           
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,0,4,3,0,5,0,6,0,7,0,8};
        pushzero(arr);
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
    }
}
