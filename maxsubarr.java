
public class maxsubarr {
  public static void main(String[] args) {
    
    int []arr={-3,2,-2,3,-5};
    int maxsum=arr[0];
    int currentsum=arr[0];
       
    for(int i=1; i<arr.length; i++){
       currentsum +=arr[i];

       if(currentsum > maxsum){
        maxsum=currentsum;
       }
       if(currentsum <0){
        currentsum =0;
       }
    }
    System.out.println("max sum:"+maxsum);
  }  
}
