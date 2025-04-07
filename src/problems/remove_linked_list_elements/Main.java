package remove_linked_list_elements;

import Listnode.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
       /* head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(7);*/
        /*head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);*/
        int target = 1;
        ListNode result = removeElements(head, target);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode current = head;
        ListNode prev = dummy;
        while (current != null) {
            if(current.val != val) {
               prev.next = current;
               prev = current;
            }else {
                prev.next = current.next;
            }
            current = current.next;
        }
        if(prev.val == -1) {
            return null;
        }
      return dummy.next;
    }


}
