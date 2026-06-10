import org.w3c.dom.Node;

class node{
    int val;
    node left;
    node right;

    node(int val){
        this.val=val;
    }
}
public class maxval {
    static int findmax(node root){
        if(root==null){
        return Integer.MIN_VALUE;
        }
    int leftMAX =findmax(root.left);
    int rightMAX= findmax(root.right);
      return Math.max(root.val, Math.max(leftMAX, rightMAX));
    }
    public static void main(String[] args) {
           node root = new node(10);
        root.left = new node(5);
        root.right = new node(15);
        root.left.left = new node(20);

        System.out.println("Maximum value: " + findmax(root));
    }
}
