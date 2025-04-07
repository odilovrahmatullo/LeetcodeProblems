package remove_duplicate_from_sortedList;

import Listnode.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = head;
        ListNode current = head;
        ListNode prev = dummy;
        while (current != null) {
            if (current.val == prev.val) {
                prev.next = current.next;
            } else {
                prev.next = current;
                prev = current;
            }
            current = current.next;
        }

        return dummy;

    }
}
