// import java.util.Scanner;

// public class tringabc {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter n:");
//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print((char)(i+64));
//             }
//             System.out.println(); // move to next line after each row
//         }
//     }
// }




import java.util.Scanner;

public class tringabc {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter n:");
//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print((char)(j+64));
//             }
//             System.out.println(); // move to next line after each row
//         }
//     }
// }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j+96));
            }
            System.out.println(); // move to next line after each row
        }
    }
}



