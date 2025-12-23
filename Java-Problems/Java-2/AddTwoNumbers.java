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

 /**
  * QUESTION NUMBER: 2
  *  RUNTIME:O(n)
  HOW IT WORKS: (throws errors because ListNode is given in the problem), Iterates through each digit and adds it 
  to a dummy link list. A carry is used to ensure digits are mathmatically correct before adding and interating
  to the next node. 
 */
class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);// a dummy node that we add to
        ListNode current = dummy;
        int carry = 0; // like in"carry the one"

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;//get the value
                l1 = l1.next;//advance to next node
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10; //needs to be a single digit
            ListNode node = new ListNode(sum %10); // add a single node to the list
            current.next = node;
            current = current.next;
        }
        return dummy.next;// need the next node
    }
}