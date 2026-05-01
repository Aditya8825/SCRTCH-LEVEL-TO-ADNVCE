// "Fizz" if divisible by 3
// "Buzz" if divisible by 5
// "FizzBuzz" if both

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();

        if(n%3==0  ){
            System.out.println("fizz");
        }else if(n%5==0){
            System.out.println("buzz");
        }else if(n%15==0){
            System.out.println("fizzbuzz");
        }
    }
}
