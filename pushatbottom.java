// import java.util.*;
// public class pushatbottom {
//     public static  void pushAtBottom(int val, Stack<Integer>s){
//         if(s.isEmpty()){
//             s.push(val);
//             return;
//         }
//         int top=s.pop();
//         pushAtBottom(val,s);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer>s= new Stack<>();
//         s.push(4);
//          s.push(3);
//           s.push(2);
//            s.push(1);
              
//            pushAtBottom(10,s);
//            while(!s.empty()){
//             System.out.println(s.peek());
//             s.pop();
//            }
//     }
// }
