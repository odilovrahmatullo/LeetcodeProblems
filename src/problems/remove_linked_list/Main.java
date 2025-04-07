package remove_linked_list;

import Listnode.ListNode;

public class Main {


    public static void main(String[] args) {

       /* ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(12);
        ListNode l3 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        ListNode prt = l1;
        while (prt!=null){
            System.out.println(prt.val);
            prt = prt.next;
        }*/

        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = head.next;
        System.out.println(myListNode(head));

    }


    public static int myListNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                while(head != slow){
                    head =  head.next;
                    slow = slow.next;
                }
                return slow.val;
            }
        }
        return 0;
    }
}
