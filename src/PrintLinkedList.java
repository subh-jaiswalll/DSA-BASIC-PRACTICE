import java.util.List;

public class PrintLinkedList {

     static void printList(ListNode head){
        ListNode current = head;

        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static void main(String[] args) {

        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);
        ListNode n5 = new ListNode(50);

        n1.next = n2;
        n2.next= n3;
        n3.next = n4;
        n4.next = n5;

        ListNode head  = n1;

printList(head);

    }
}
