public class ReversList {


    static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode end = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return end;

    }

    static ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode result = head;
        int count = 0;
        while (curr != null) {
            count++;
            if (count % 2 == 0)
                result = result.next;
            curr= curr.next;
        }
        return result;
    }

    static ListNode revList(ListNode head) {
        ListNode curr= head;
        ListNode end =null;
        while(curr !=null){
            ListNode temp = curr.next ;

            curr.next = end ;
            end =curr;
            curr = temp;
        }
        return end;

    }




    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
         //System.out.println(reverseList(l1).val);
        System.out.println(ReversList.revList(l1));
        //System.out.println(ReversList.middleNode(l1).val);
    }


}
