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

    private int size;
    private ListNode head;
    private Random random;

    public Solution(ListNode head) {

        this.head = head;
        ListNode temp = head;

        this.random = new Random();

        size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
    }

    public int getRandom() {

        int r = this.random.nextInt(size);
        int t = 0;
        ListNode temp = head;

        while (temp != null) {
            if (t == r)
                return temp.val;
            t++;
            temp = temp.next;
        }

        return -1;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */