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
        int n = 0 ;
        ListNode curr = head ;
        ListNode curr2 = head ;
        while(head != null){
            n ++ ;
            head = head.next ;
        }   
        int a = n/2 ;
        // System.out.println(a);
        if(a == 0){
            curr2 = null ;
        }
        for(int i = 0 ; i < a-1 ;i ++){
            curr = curr.next ;
        }    
        if(curr.next != null){
            curr.next = curr.next.next ;
        }
        
        return curr2 ;
    }
}