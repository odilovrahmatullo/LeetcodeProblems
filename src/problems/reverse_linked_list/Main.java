package reverse_linked_list;


import Listnode.ListNode;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next = new ListNode(2);
        print(head);
        System.out.println("\nreversed");
        reverse(head);

        System.out.println("\nreversedList");
        print(reverseList(head));


    }

    public static void print(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void reverse(ListNode head){
        Stack<Integer> myStack = new Stack<>();
        while(head != null){
            myStack.push(head.val);
            head = head.next;
        }

        ListNode head2 = new ListNode(Integer.MIN_VALUE);
        ListNode temp = head2;

        while(!myStack.isEmpty()){
            temp.next = new ListNode(myStack.pop());
            temp = temp.next;
        }

        print(head2.next);

    }


    public static ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode  = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;

        return head;
    }
}
