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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sum = new ListNode();
        ListNode sum1 = sum;

        int carry = 0;

        while (l1 != null || l2 != null) {

            sum1.next = new ListNode();
            sum1 = sum1.next;
            
            if(l1 == null){
                l1 = new ListNode();
            } else if(l2 == null){
                l2 = new ListNode();
            }

            int digit = l1.val + l2.val + carry;

            carry = digit /10;
            digit = digit % 10;

            sum1.val = digit;
            sum1.next = null;
            

            l1 = l1.next;
            l2 = l2.next;

        }
        
        if(carry != 0){
            sum1.next = new ListNode(carry,null);
        }
        
        sum = sum.next;

        return sum;
        
    }
}