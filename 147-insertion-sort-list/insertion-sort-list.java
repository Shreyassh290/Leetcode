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
    public ListNode insertionSortList(ListNode head) {
       if(head==null || head.next==null){
        return head;
       }
       ListNode n=new ListNode(0);
       n.next=head;
       ListNode t=head;
       ListNode t1=head;
       int min=Integer.MAX_VALUE;
       while(t!=null && t.next!=null){
        t1=head;
        while(t1!=null && t1.next!=null){
         if(t1.next!=null && t1.val>t1.next.val){
            int te=t1.val;
            t1.val=t1.next.val;
            t1.next.val=te;
         }
         t1=t1.next;
        }
        t=t.next;
       }
       return head;
    }
}