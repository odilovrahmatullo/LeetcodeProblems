package problems.delete_middle_linked_list;


import Listnode.ListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(7);
        ListNode h5 = new ListNode(1);
        ListNode h6 = new ListNode(2);
        ListNode h7 = new ListNode(6);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = h7;
        h7.next = null;

        showNodes(deleteMiddle(h1));
    }


    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }


    private static void showNodes(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


}
