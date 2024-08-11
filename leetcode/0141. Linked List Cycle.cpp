/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode* head) {
        // Floyd Cycle Detection Algorithm
        ListNode *turtle = head, *hare = head;
        while (hare != nullptr && hare->next != nullptr) {
            hare = hare->next->next;
            turtle = turtle->next;
            if (hare == turtle)
                return true;
        }
        return false;
    }
};