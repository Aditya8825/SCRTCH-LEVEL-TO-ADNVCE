public class sortedarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

        boolean issorted=true;
        int n=arr.length;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
      
            
        System.out.println("sorted elemet:"+issorted);
    }
}

