/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    let visited = new Set();

    let temp = head;

    while (temp !== null) {
        
        // console.log('temp is now: '+temp.val);
        
        if(visited.has(temp))
            return temp;
        visited.add(temp);
        temp = temp.next;
    }

    return null;
};