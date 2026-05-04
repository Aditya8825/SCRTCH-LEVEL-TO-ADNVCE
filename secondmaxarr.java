public class secondmaxarr {
    public static void main(String[] args) {
        int []arr={3,3,4,5,6,7,8,89,0};
        int max=arr[0];
        int secondlargest=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
           max=arr[i];               
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondlargest && arr[i]!=max){
                secondlargest=arr[i];
            }
        }
        System.out.println("first largest elment: "+max+" second largestelement: "+secondlargest);
    }
}

