public class colsnake {

    public static void main(String[] args) {
        int [][]arr={
            {2,8,3,4},
            {7,2,1,6},
            {5,5,4,1},
            {3,1,8,2}
              
            };
            for(int i=0; i<arr[0].length; i++){
            if(i%2 ==0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr.length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
}
}

