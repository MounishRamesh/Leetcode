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
    public int getDecimalValue(ListNode head) {
        int a = findlength(head) ;
        a-- ;
        int count = 0 ;
        while(head != null){
            int val = head.val ;
            if(val != 0){
                count += Math.pow(2,a) ;
            }
            a --;
            head = head.next ;
        }
        return count ;
    }
    public static int findlength(ListNode head){
        int count = 0 ;
        while(head != null){
            head = head.next ;
            count ++;
        }
        return count ;
    }
}