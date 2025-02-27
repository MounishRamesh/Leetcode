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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next ;
        }
        ListNode curr = head ;
        ListNode prev = null ;
        ListNode next = null ;
        while(curr != null){
            next = curr.next ;
            if(curr.val == val){
                   prev.next = next ;
                
            }
            else{
                prev = curr ;
            }
            curr.next = next  ;
            curr = curr.next ;
        }
        return head ;
    }
}