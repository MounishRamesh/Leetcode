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
        List<Integer> ls = new ArrayList<>() ;
        while(head != null){
            ls.add(head.val) ;
            head = head.next ;
        }
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        for(int i : ls){
            hs.put(i , hs.getOrDefault(i,0)+1) ;
        }
    //    System.out.println(ls) ;
        ListNode curr = new ListNode(0) ;
        ListNode tem = curr ;
        for(int i = 0 ; i < ls.size() ; i ++){
            int val = ls.get(i) ;
            if(hs.get(val) == 1){
                tem.next = new ListNode(val) ;
                tem = tem.next ;
            }
        }
        return curr.next ;
    }
}