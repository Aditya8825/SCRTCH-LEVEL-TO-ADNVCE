public class assigmnet {
    public static void main(String[] args) {
             int []arr={3,4,5,56,6};
                for(int i=0; i<arr.length; i++){
                    if(i%2 ==1){
                         arr[i] *=2;
                    } else{
                        arr[i] +=10;
                    }
                }
                
                  print(arr);
                }
                static void print(int []arr){
                    for(int i=0; i<arr.length; i++){

                    
                    System.out.println(arr[i]+" ");
                }
                System.out.println();
            
    }
}
