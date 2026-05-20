public class insertanelementintosorted {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6};
        int n=arr.length;
        int key=3;

        int[]result=new int[n+1];
        int i=0,j=0;

        while(i<n && arr[i]<key){
            result[j++]=arr[i++];
        }
        result[j++]=key;

        while (i<n) {
            result[j++]=arr[i++];
        }
        System.out.println("array after insertion: ");

        for(int num: result){
            System.out.println(num+" ");
        }
    }
}
