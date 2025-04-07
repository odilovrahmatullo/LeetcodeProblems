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

       /*  System.out.println("\n Insert value into anywhere ");

        insertIntoMiddle(h1, 12, 4);*/

        /*System.out.println("\n Insert value into Head ");

        insertIntoHead(h1, 7);

        System.out.println("\n Insert value into End ");

        insertIntoEnd(h1, 99);*/

       /* System.out.println("\n delete from lis by target value ");

        showNodes(deleteEqualsValue(h1, 90));*/

        /*System.out.println("\n delete from middle by position ");

        showNodes(deleteFromMiddle(h1, 4));*/

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

    public static ListNode deleteEqualsValue(ListNode head, int target) {

        if (head == null) return head;

        if (head.val == target) {
            head = head.next;
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        while (curr.next != null) {
            if (curr.val == target) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;

        }
        return head;

    }

    public static void insertIntoHead(ListNode head, int valueToInsert) {

        ListNode newNode = new ListNode(valueToInsert);

        newNode.next = head;

        head = newNode;

        showNodes(head);
    }

    public static void insertIntoEnd(ListNode head, int valueToInsert) {

        ListNode newNode = new ListNode(valueToInsert);

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        showNodes(head);
    }

    public static void insertIntoMiddle(ListNode head, int valueToInsert, int position) {

        ListNode newNode = new ListNode(valueToInsert);

        ListNode temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        showNodes(head);
    }
}
