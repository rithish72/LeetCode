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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while(head != null){
            count++;
            head = head.next;
        }
        head = temp;
        count = count/2 - 1;
        while(count > 0){
            head = head.next;
            count--;
        }
        head.next = head.next.next;
        return temp;
    }
}