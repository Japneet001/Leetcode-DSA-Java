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
    private int lengthLL(ListNode head){
        ListNode temp = head;
        int ans = 0;
        while(temp != null){
            ans++;
            temp = temp.next;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
        int len = lengthLL(head);
        ListNode temp = head;
        for(int i = 0; i < len / 2; i++){
            temp = temp.next;
        }
        return temp;
    }
}