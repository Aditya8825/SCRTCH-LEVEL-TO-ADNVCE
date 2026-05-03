public class max {
static int maxnum(int [] arr){
    if(arr==null || arr.length==0) {
        return -1;
    }
    int max=arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        int [] arr={1,2,3,4,50};
        int max=maxnum(arr);
        System.out.println("largest number:"+max);
    }
}
