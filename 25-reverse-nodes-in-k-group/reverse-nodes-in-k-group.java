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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head ;
        ListNode curr2 = head ;
        List<Integer> ls = new ArrayList<>() ;
        while(head != null){
            ls.add(head.val) ;
            head = head.next ;
        }
        int i = 0 ; 
        while(i < ls.size()){
            int a = i ;
            int b = (i+k)-1;
            swap(a,b,ls) ;
            i += k ;
        }
        for(int j = 0  ; j < ls.size() ;j ++){
            curr.next = new ListNode(ls.get(j)) ;
            curr = curr.next ;
        }
        return curr2.next ;
    }
    public static void swap(int i , int j , List<Integer> ls){
        if(j >= ls.size()){
            return ;
        }
        while(i < j){
           int tem = ls.get(i) ;
           ls.set(i,ls.get(j)) ;
           ls.set(j,tem) ;
           i ++ ;
           j -- ;
        }
    }
}