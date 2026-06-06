// import java.util.*;
// public class revevsertsck {
//     public static  void pushAtBottom(int val, Stack<Integer>s){
//         if(s.isEmpty()){
//             s.push(val);
//             return;
//         }
//         int top=s.pop();
//         pushAtBottom(val,s);
//         s.push(top);
//     }

//     public static void reverse(Stack<Integer>s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top=s.pop();
//         reverse(s);
//         pushAtBottom(top,s);
//     }
//     public static void main(String[] args) {
//         Stack<Integer>s= new Stack<>();
//         s.push(4);
//          s.push(3);
//           s.push(2);
//            s.push(1);

//            reverse(s);
              
//           // pushAtBottom(10,s);
//            while(!s.empty()){
//             System.out.println(s.peek());
//             s.pop();
//            }
//     }
// }
