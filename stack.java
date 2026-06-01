import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        st.push("aditya");
        st.push("adi");
        st.push("mukesh");
        st.push("adityaraj");
           System.out.println(st.size());
        System.out.println(st);

        System.out.println(" after popping element ");
        st.pop();
        
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());

    }
}