package swap_notes_in_pairs;


import Listnode.ListNode;

public class Main {
    public static void main(String[] args) {


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode current = swapPairs(head);

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }


    }


    public static ListNode swapPairs(ListNode head) {

        ListNode helper = new ListNode(0);
        helper.next = head;

        ListNode point = helper;


        while (point.next != null && point.next.next != null) {
            ListNode swapper1 = point.next;
            ListNode swapper2 = point.next.next;


            swapper1.next = swapper2.next;
            swapper2.next = swapper1;

            point.next = swapper2;
            point = swapper1;
        }


        return helper.next;


    }
}
