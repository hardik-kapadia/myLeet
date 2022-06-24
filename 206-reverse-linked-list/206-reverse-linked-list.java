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
    public ListNode reverseList(ListNode head) {
        
        ListNode temp = head;
        ListNode prev = null;
        
        ListNode iter = head;
        
        while(iter != null){
            
            ListNode t = iter.next;
            
            temp = iter;
            temp.next = prev;
            
            iter = t;
            prev = temp;
            
        }
        
        return temp;
        
    }
}