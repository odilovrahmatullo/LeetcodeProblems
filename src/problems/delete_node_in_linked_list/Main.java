package problems.delete_node_in_linked_list;

import Listnode.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(7);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
