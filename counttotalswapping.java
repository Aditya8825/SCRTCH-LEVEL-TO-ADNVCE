public class counttotalswapping {
    static int bubblesort(int[]arr){
        int swaps=0;
        for(int i=0; i<arr.length-1; i++ ){
            for(int j=0; j<arr.length-1-j; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;

                }
            }
        }
        return swaps;
    }
         public static void main(String[] args){
            int []arr={5,3,6,3,1,2};
            int totoalswap=bubblesort(arr);
            System.out.print("totalswaps= "+totoalswap);
    }
}
