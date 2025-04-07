package convert_binary_number_to_integer;

import Listnode.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        /*head.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = head.next;*/
        System.out.println(getDecimalValue(head));

    }


    public static int getDecimalValue(ListNode head) {
        int summa = head.val;
        while(head.next != null) {
            head = head.next;
            summa = summa*2+head.val;
        }
        return summa;
    }



}
