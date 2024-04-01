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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int last_k = count - k;
        temp = head;
        while(k > 1){
            temp = temp.next;
            k--;
        }
        ListNode temp1 = head;
        while(last_k > 0){
            temp1 = temp1.next;
            last_k--;
        }
        int tem = temp.val;
        temp.val = temp1.val;
        temp1.val = tem;
        return head;
    }
}