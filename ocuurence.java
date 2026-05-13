public class ocuurence {
    static int ocuurence(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid; 

                //right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid-1;
            }
            else{
                right=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,5};
        int ans=ocuurence(arr,2);
        System.out.println("no of occurenc= "+2+" is"+ans);
    }
}
