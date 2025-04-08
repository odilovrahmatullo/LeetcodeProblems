package problems.remove_nth_from_end;

import Listnode.ListNode;
import data_structure.LinkedList;

public class Main {
    public static void main(String[] args) {


        ListNode head = new ListNode(10);
        ListNode h2 = new ListNode(15);
        ListNode h3 = new ListNode(9);
        ListNode h4 = new ListNode(-19);
        ListNode h5 = new ListNode(21);
        ListNode h6 = new ListNode(18);

        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;

        System.out.println(" before");
        LinkedList.showNodes(head);
        System.out.println(" \n after ");

        LinkedList.showNodes(removeNthFromEnd(head, 3));
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }


}


