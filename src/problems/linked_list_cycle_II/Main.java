package problems.linked_list_cycle_II;

import Listnode.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(43);
        ListNode h1 = new ListNode(10);
        ListNode h2 = new ListNode(15);
        ListNode h3 = new ListNode(9);
        ListNode h4 = new ListNode(-19);
        ListNode h5 = new ListNode(21);
        ListNode h6 = new ListNode(18);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;
    }


    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                while (head!=slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
