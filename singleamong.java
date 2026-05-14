

public class singleamong {
    static int singlelement(int []arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=(left+right)/2;

            //make mid
            if(mid%2==1){
                mid--;
            }
            //pair is correct
            if(arr[mid]==arr[mid+1]){
                left=mid+2;
            }else{
                right=mid;
            }
        }
        return arr[left];
    
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,3,4,4,5,6,6,7,7};
         System.out.println(singlelement(arr));
    }
}
