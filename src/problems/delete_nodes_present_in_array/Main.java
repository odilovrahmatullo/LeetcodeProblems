package problems.delete_nodes_present_in_array;

import Listnode.ListNode;
import data_structure.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode h1 = new ListNode(10);
        ListNode h2 = new ListNode(9);
       /* ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(5);*/


        head.next = h1;
        h1.next = h2;
        h2.next = null;
      /*  h3.next = h4;
        h4.next = null;*/

        System.out.println("before result ");
        LinkedList.showNodes(head);

        int[] array = {9, 2, 5};

        System.out.println("\n after result ");
        LinkedList.showNodes(modifiedList(array, head));

    }

    public static ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }


}
