import java.util.Scanner;

public class seriesAplha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter N:");
        int n = sc.nextInt();
       
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j + 64));
                // System.out.print(j);
            }
            System.out.println(); // move to next line after each row
            //print number 
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
             System.out.println();
        }
    }  
}