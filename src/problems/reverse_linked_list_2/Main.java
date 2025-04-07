package reverse_linked_list_2;


import Listnode.ListNode;

public class Main {

    public static void main(String[] args) {

        ListNode head = new ListNode(17);
        head.next = new ListNode(21);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(60);
        head.next.next.next.next = new ListNode(93);

        int left = 1;
        int right = 4;

        ListNode current = reverseBetween(head, left, right);
        System.out.println(current.val);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }


    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode leftNode = helper;
        ListNode currentNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftNode = leftNode.next;
            currentNode = currentNode.next;
        }


        ListNode connectionNode = currentNode;


        ListNode previousNode = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        leftNode.next = previousNode;
        connectionNode.next = currentNode;

        return helper.next;

    }
}
