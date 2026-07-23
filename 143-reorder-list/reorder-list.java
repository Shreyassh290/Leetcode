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
    static ListNode rev(ListNode head){
        ListNode cur,prev,nex;
        cur=head;
        prev=null;
        nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
        return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=rev(slow.next);
        slow.next=null;
        ListNode first=head;
        if(first==null){
            head=second;
            return;
        }
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;

            first.next=second;
            second.next=t1;

            first=t1;
            second=t2;
        }
           
    }
}