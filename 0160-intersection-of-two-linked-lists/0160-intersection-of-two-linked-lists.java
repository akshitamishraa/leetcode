/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != null){
            currB = headB;
            while(currB != null){
                if(currA == currB){
                    return currA;
                }

                currB = currB.next;
            }
            currA = currA.next;
        }
        return null;
    }
}