public class RemoveLinkedListElements {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public ListNode removeElements(ListNode head, int val) {
        //dummy node to provide space to check the NEXT element
        ListNode dummy = new ListNode(0, head);
        //Node used for traversal
        ListNode current = dummy;
        while(current.next != null){
            if(current.next.val == val){
                //removed from list
                current.next = current.next.next;
            }
            else{
                //just traversing
                current = current.next;
            }
        }
        //return the next node to avoid including the dummy
        return dummy.next;
    }
}