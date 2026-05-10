
public class movedto90degree {
    static void rotate(int [][] arr){
        int n=arr.length;

        // transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        //reverse each row
        for(int i=0; i<n; i++){
            int left=0;
            int right=n-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }
    }
    public static void print(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

    }
}
