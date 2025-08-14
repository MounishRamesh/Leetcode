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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head ;
        List<Integer> ls = new ArrayList<>() ;
        while(curr != null){
            ls.add(curr.val) ;
            curr = curr.next ;
        }
        int sum = 0 ;
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i = 1; i < ls.size() ;i ++){
            if(ls.get(i) == 0){
                ls1.add(sum) ;
                // System.out.println(ls1) ;
                sum = 0 ;
            }
            sum = sum + ls.get(i) ;
        }
        ListNode tree = new ListNode(ls1.get(0)) ;
        ListNode temp = tree ;
        for(int i = 1 ;i < ls1.size() ; i ++){
            temp.next = new ListNode(ls1.get(i)) ;
            temp = temp.next ;
        }
        return tree ;
    }
}