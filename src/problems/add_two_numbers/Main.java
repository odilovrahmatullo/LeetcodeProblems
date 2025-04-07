package problems.add_two_numbers;

import Listnode.ListNode;


public class Main {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(9);
        head1.next.next.next = new ListNode(9);
        head1.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next.next = new ListNode(9);

        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);
        head2.next.next.next = new ListNode(9);


        ListNode result = addTwoNumbers(head1, head2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int rest = 0;

        while (l1 != null || l2 != null) {
            int summa = 0 + rest;
            if (l1 != null) {
                summa += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                summa += l2.val;
                l2 = l2.next;
            }

            rest = summa / 10;
            summa = summa % 10;
            current.next = new ListNode(summa);
            current = current.next;

            if (rest == 1) {
                current.next = new ListNode(rest);
            }
        }
        return dummy.next;
    }
}
