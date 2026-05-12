// public class reverseklength{
//     public static void main(String[] args) {
//         String str="abcdefghi";
//         int k=3;
//         String result="";
   
//         for(int i=0; i<str.length(); i+=k){
//             int end=Math.min(i+k,str.length());
//             String part=str.substring(i,end);
//             result +=reverse(part);

//         }
//         System.out.println(result);
//     }

// }
// public static String reverse(String s){
//     String rev="";
//      for(int i=s.length()-1; i>=0; i--){
//         rev +=s.charAt(i);
//      }
//      return rev;
// }