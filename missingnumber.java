import java.util.HashSet;

public class missingnumber {
    static int missingnumber (int arr[],int n){
        HashSet<Integer>set= new HashSet<>();
        for (int num : arr) {
         set.add(num);
    }
    for(int i=0; i<=n; i++){
        if(!set.contains(i)){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={3,0,1};
        int n=7;
        System.out.println(missingnumber(arr,n));
    }
}
