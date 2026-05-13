public class descendingsearch {
    static int binaryseach(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            //element found
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                left=mid+1;
            }
        }
        return -1;
        }
    
    public static void main(String[] args) {
           int []arr={9,8,7,6,5};
           int ans=binaryseach(arr,7);
           System.out.println("index= "+7+" is"+ans);

    }
}
