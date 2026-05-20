import java.util.Scanner;

public class insertionsortusinginput {
    static void insertionsort(int[]arr){
        for(int i=1; i<arr.length; i++){

            int key=arr[i];
            int j=i-1;

            //move element greateer
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.print("enter array size: ");
        int n=sc.nextInt();
           
        int[]arr =new int[n];
        System.out.println("enter array element: ");
        for(int i=0; i<n; i++){
           arr[i]=sc.nextInt();
        }
        insertionsort(arr);
        System.out.println("sorted array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
