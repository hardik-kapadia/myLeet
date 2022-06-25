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
        ListNode temp1 = head;
        
        boolean turn = false;
        
        while(temp != null){
            
            if(turn){
                temp1 = temp1.next;
                turn = false;
            } else 
                turn = true;
            
            temp = temp.next;
            
            
        }
        
        return temp1;
        
    }
}