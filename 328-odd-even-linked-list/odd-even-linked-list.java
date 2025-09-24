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
    public ListNode oddEvenList(ListNode head) {
        ListNode d = new ListNode(0) ;
        ListNode curr = d ;
        ListNode d1 = new ListNode(0) ;
        ListNode curr2 = d1 ;
        int j = 0 ;
        ListNode a = head ;
        while(a != null){
            if(j%2 == 0){
                curr.next = new ListNode(a.val) ;
                curr = curr.next ;
            }
            else{
                curr2.next = new ListNode(a.val) ;
                curr2 = curr2.next ;
            }
            j ++ ;
            a = a.next ;
        }
        d = d.next ;
        d1 = d1.next ;
        ListNode ans = new ListNode(0) ;
        ListNode dummy = ans ;
        dummy.next = d ;
        while(dummy.next != null){
            dummy = dummy.next ;
        }  
        dummy.next = d1 ;
        return ans.next ;
    }
}