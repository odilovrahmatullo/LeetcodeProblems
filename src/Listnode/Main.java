package Listnode;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
       /* head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(7);*/
        /*head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);*/
        int target = 1;
        ListNode result = head;

        //show Linked List
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
