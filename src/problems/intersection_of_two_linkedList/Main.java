package intersection_of_two_linkedList;

import Listnode.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = intersection;


        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(1);
        head1.next.next.next = intersection;

        System.out.println(getIntersectionNode(head, head1).val);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int a = getSize(headA);
        int b = getSize(headB);
        while(a>b){
            a--;
            headA = headA.next;

        }
        while(b>a){
            b--;
            headB = headB.next;
        }

        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

    }

    public static int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }
}
