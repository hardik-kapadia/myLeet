/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
    ListNode *temp = head;
    ListNode *t = head;

    int sz = 0;

    while (t != NULL)
    {
        sz++;
        t = t->next;
    }

    int node = sz - n - 1;

    if (sz == 1)
        return NULL;

    if (node < 0)
        return head->next;


    for (int i = 0; i < node; i++)
        temp = temp->next;

    temp->next = temp->next->next;

    return head;
    }
};