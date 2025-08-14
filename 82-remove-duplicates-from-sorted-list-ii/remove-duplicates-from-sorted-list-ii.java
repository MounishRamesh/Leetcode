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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = new ListNode(0) ;
        curr.next = head ;
        ListNode temp = curr ;
        //ListNode prev = head ;
        while(head != null){
            if(head.next != null && head.next.val == head.val){
                while(head.next != null && head.next.val == head.val){
                    head = head.next ;
                }
                temp.next = head.next ;
                head = head.next ;
            }
            else{
                temp = temp.next ;
                head = head.next ;
            }
            
        }
        return curr.next ;
    }
}