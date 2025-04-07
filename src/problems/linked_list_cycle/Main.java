package linked_list_cycle;

import Listnode.ListNode;



public class Main {

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next = head.next;

        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }

        }
        return false;
    }


}
