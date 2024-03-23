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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        int count = 1;
        while(count != a){
            nodeA = nodeA.next;
            count++;
        }
        ListNode nodeB = nodeA.next;
        while(count != b + 1){
            nodeB = nodeB.next;
            count++;
        }

        nodeA.next = list2;
        ListNode temp = list2;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nodeB;
        return list1;
    }
}