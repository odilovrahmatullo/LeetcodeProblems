package data_structure;

import Listnode.ListNode;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        ListNode h1 = new ListNode(10);
        ListNode h2 = new ListNode(15);
        ListNode h3 = new ListNode(9);
        ListNode h4 = new ListNode(-19);
        ListNode h5 = new ListNode(21);
        ListNode h6 = new ListNode(18);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;

        System.out.println(" all nodes ");

        showNodes(h1);

        System.out.println("\n delete from middle ");

        showNodes(deleteFromMiddle(h1, 4));

       /* System.out.println("\n Deleting from head ");
        showNodes(deleteNodeFromHead(h1));

        System.out.println("\n Deleting from end");

        showNodes(deleteNodeFromEnd(h1));
*/
    }

    public static void showNodes(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode deleteNodeFromHead(ListNode head) {
        head = head.next;
        return head;
    }

    public static ListNode deleteNodeFromEnd(ListNode head) {
        ListNode temp = head;
        while (temp.next.next != null) temp = temp.next;

        temp.next = null;

        return head;

    }

    public static ListNode deleteFromMiddle(ListNode head, int position) {
        ListNode ptr = head;

        for (int i = 1; i < position - 1; i++) {
            if (ptr.next == null) return head;
            ptr = ptr.next;
        }

        ListNode nodeToDelete = ptr.next;
        if (nodeToDelete == null) return head;

        ListNode nextNode = nodeToDelete.next;

        ptr.next = nextNode;

        return head;
    }

}
