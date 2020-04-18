import java.util.List;

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

public class RotateList {
    static ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next ==null) return null;

        ListNode current = head;
        int n;
        for(n=1; current.next !=null ;n++){
            current = current.next;
        }
        current.next = head;

        ListNode newNode = head;

        for(int i=0; i< n-k % n-1  ;i++){
            newNode = newNode.next;
        }
        ListNode new_head = newNode.next;

        newNode.next = null;
        return new_head;

    }


    static ListNode rotatrRight(ListNode head,int k){
        if(head ==null) return null;
        for (int i = 0; i <k ; i++) {
            nextOne(head);
        }
        return head;
    }


    static ListNode nextOne(ListNode head) {
        ListNode current = head;
        while(true){
            if(current.next == null){
                current.next = head.next;
                current = head;
                break;
            }else current = current.next;

        }
        return current;
    }

    public static void main(String[] args) {
       // rotatrRight()
    }
}
