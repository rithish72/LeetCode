/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    const list = [];
    temp = head;
    while(head){
        list.push(head.val)
        head = head.next;
    }
    while(temp){
        if(list.pop() != temp.val){
            return false;
        }
        temp = temp.next;
    }
    return true;
};