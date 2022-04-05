import java.util.*;

public class BinaryTree {
    Node root;
    
    BinaryTree() {
        root = null;
    }
    
    public void levelOrderTreeTraversal() { //  Using queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            Node tempNode = queue.poll();  //retreives head
            System.out.println(tempNode.data + " ");
            
            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }
            
            if(tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
    
    ArrayList<Integer> inOrderTreeTraversalUsingStack(Node root) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            
            Node tempNode = stack.peek();
            if(tempNode.left != null) {
                stack.push(tempNode.left);
                tempNode.left = null;
            } else {
                arrList.add(tempNode.data);
                stack.pop();
                if(tempNode.right != null) {
                    stack.push(tempNode.right);
                }
            }
        }
        return arrList;
    }
    
    public ArrayList<Integer> inorderTreeTraversalUsingRecursion(Node root) {
        ArrayList<Integer> arrList = new ArrayList<>();
        if(root == null) {
            return null;
        } else {
            if(root.left != null) {
                inorderTreeTraversalUsingRecursion(root.left);
            }
            
            arrList.add(root.data);
            
            if(root.right != null) {
                inorderTreeTraversalUsingRecursion(root.right);
            }
        }
        
        return arrList;
    }
}
