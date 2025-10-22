/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null){
            return null;
        }

        ListNode r = head ;
        ListNode t = head ;
        while (r!=null && r.next!=null){
            r = r.next.next; 
            t = t.next ;
            if (r ==t){
                r = head; 
                while (r!=t){
                    r = r.next;
                    t = t.next;
                }
                return r;
            }
        }
        return null; 












    }
}
