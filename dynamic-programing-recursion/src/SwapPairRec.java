class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val =x;
    }
}
public class SwapPairRec {
    ListNode head;
    ListNode last;
    public SwapPairRec() {
        head =last=null;
    }

    public void insert(int value){
        ListNode node = new ListNode(value);

        if(head == null){
            head =last= node;
            return;
        }
       last.next = node;
        last=node;


    }

    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null) return head;
        ListNode lastNode =  reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return lastNode;



    }

    public static void main(String[] args) {

        SwapPairRec swapPairRec = new SwapPairRec();
        swapPairRec.insert(10);
        swapPairRec.insert(20);
        swapPairRec.insert(30);
        swapPairRec.insert(40);

        ListNode newNode =swapPairRec.reverseList(swapPairRec.head);
       // ListNode newNode =swapPairRec.swapPairs(swapPairRec.head);
    }

    public ListNode swapPairs(ListNode swap) {

        // If the list has no node or has only one node left.
        if ((swap == null) || (swap.next == null)) {
            return swap;
        }

        // Nodes to be swapped
        ListNode firstNode = swap;
        ListNode secondNode = swap.next;

        // Swapping
        firstNode.next  = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        // Now the head is the second node
        return secondNode;
    }
}
