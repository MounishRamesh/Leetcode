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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 0 ;
        List<Integer> ls = new ArrayList<>() ;
        while(head != null){
            count ++ ;
            ls.add(head.val) ;
            head = head.next ;
        }
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i = left-1 ; i < right ; i ++){
            ls1.add(ls.get(i)) ;
        }
        Collections.reverse(ls1) ;
        int j = 0 ;
        int val = 0 ;
        ListNode curr = new ListNode(0) ;
        ListNode tem = curr ;
        for(int i = 0 ;i < ls.size() ; i ++){
            if(i>=left-1 && i <=right-1){
                val = ls1.get(j) ;
                j ++ ;
            }
            else{
                val = ls.get(i) ;
            }
            curr.next = new ListNode(val) ;
            curr = curr.next ;
        }
        return tem.next ;
    }
}