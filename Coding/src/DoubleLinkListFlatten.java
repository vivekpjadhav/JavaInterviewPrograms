import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleLinkListFlatten {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }
    static Node flatten(Node head){
        if(head == null) return null;
        Deque<Node> stack = new ArrayDeque<>();
        Node curr = head;
        while(curr != null){
            if(curr.child !=null){
                if(curr.next!=null){
                    stack.push(curr.next);
                }
                curr.next = curr.child;
                if(curr.next!=null){
                    curr.next.prev = curr;
                }
                curr.child=null;
            }else if(curr.next ==null && !stack.isEmpty()){
                curr.next = stack.pop();
                if(curr.next !=null)
                    curr.next.prev = curr;
            }
            curr = curr.next;

        }
        return head;
    }
}
