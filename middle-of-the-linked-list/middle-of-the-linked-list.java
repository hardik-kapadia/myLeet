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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        ListNode t = head;

        boolean move = false;

        while (temp != null) {

            temp = temp.next;

            if(move)
                t = t.next;

            move = !move;
            
        }
        return t;
        
    }
}