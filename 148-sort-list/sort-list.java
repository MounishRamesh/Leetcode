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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> hs = new ArrayList<>() ;
        while(head != null){
            hs.add(head.val) ;
            head = head.next ;
        }
        Collections.sort(hs) ;
        ListNode ln = new ListNode(0) ;
        ListNode tem = ln ;
        for(int i : hs){
            tem.next = new ListNode(i) ;
            tem = tem.next ;
        }
        return ln.next ;
    }
}