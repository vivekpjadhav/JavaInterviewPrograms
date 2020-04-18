import java.util.Arrays;

public class LinkedListPalindrom {

    private static ListNode front;

    private static boolean check(ListNode curr) {

        if (curr != null) {
            System.out.println(curr.val);
            if (!check(curr.next)){
                return false;
            }
            if (curr.val != front.val){
                return false;
            }
            System.out.println(curr.val+"--curr value and front ---"+front.val);

            front = front.next;
        }
        return true;
    }

    public static boolean isPalindrome(ListNode head) {
        front = head;
        return check(head);
    }

    public static void main(String[] args) {

            ListNode l1 = new ListNode(5);
            l1.next = new ListNode(6);
            l1.next.next = new ListNode(7);
            l1.next.next.next = new ListNode(6);
            l1.next.next.next.next = new ListNode(5);
        System.out.println(isPalindrome(l1));
    }


}


 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
