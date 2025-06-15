// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode curr = head ;
//         int count = 1 ;
//         while(curr.next != null){
//             curr = curr.next ;
//             count ++ ;
//         }
//         curr = curr.next ;
//         if(count == 1){
//             head = null ;
//             return head ;
//         }
//         int val = count - n ;
//         ListNode curr2 = head ;
        
//         if(val == 0){
//             if(head.next != null){
//                 curr2 = head.next ;
//                 head = curr2 ;
//                 return head ;
//             }
//         }
//         for(int i = 1 ; i < val ; i ++){
//             if(curr2.next != null){
//                 curr2= curr2.next ;
//             }
//         }
//         System.out.print(curr2.val) ;
//         if(curr2.next != null){
//             curr2.next = curr2.next.next ;
//             //System.out.print(curr2.next.val ); 
//         }
//         return head ;
//     }
// }

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int i = 0, traverseTill = length - n - 1;
        if(traverseTill == -1) return head.next;
        ListNode curr = head;
        while(i < traverseTill){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
    public int findLength(ListNode head){
        int count = 0;
        if(head == null) return count;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}