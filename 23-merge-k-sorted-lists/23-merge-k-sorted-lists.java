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
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        if(lists.length == 0)
            return null;
        
        if(lists.length == 1)
            return lists[0];
        
        if(lists.length == 2)
            return mergeTwoLists(lists[0],lists[1]);
        
        int mid = lists.length/2;
        
        return mergeTwoLists(mergeKLists(Arrays.copyOfRange(lists,0,mid)),mergeKLists(Arrays.copyOfRange(lists,mid,lists.length)));
        
        
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        
        if(l1 == null)
            return l2;
        
        if(l2 == null)
            return l1;
        
        ListNode newList = new ListNode();
        ListNode temp = newList;
        
        while(l1 != null && l2 != null) {
            
            if(l1.val < l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            
            temp = temp.next;
            
        }
        
        if(l2 != null)
            temp.next = l2;
        else
            temp.next = l1;
        
        return newList.next;
        
    }
    
}