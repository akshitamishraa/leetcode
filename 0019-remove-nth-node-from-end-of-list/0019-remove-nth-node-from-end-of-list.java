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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pHead = new ListNode(0);
        pHead.next = head;

        ListNode curr = pHead;
        ListNode temp = pHead;

        int i = 0;

        while(i <= n){
            curr = curr.next;
            i++;
        }

        while(curr != null){
            curr = curr.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return pHead.next;
    }
}