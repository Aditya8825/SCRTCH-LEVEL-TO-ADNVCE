// import java.util.*;

// public class circularqueuegame {
//     public int findthewinner(int n, int k) {
//         Queue<Integer> q = new LinkedList<>();
//         for (int i = 1; i <= n; i++) {
//             q.add(i);
//         }
//         while (q.size() > 1) {
//             for (int i = 1; i <= k - 1; i++) {
//                 q.add(q.remove());
//             }
//             q.remove();
//         }
//         return q.peek();
//     }

//     public static void main(String[] args) {
//         circularqueuegame game = new circularqueuegame();
//         System.out.println(game.findthewinner(5, 2));
//     }
// }