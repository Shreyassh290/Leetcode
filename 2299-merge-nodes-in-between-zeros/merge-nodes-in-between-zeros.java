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
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        temp=temp.next;
        ListNode d=new ListNode(0);
        int sum=0;
        ListNode l=d;
        while(temp!=null){
           if(temp.val==0){
            ListNode n=new ListNode(sum);
            l.next=n;
            l=l.next;
            sum=0;
           }
           else{
           sum+=temp.val;
           }
           temp=temp.next;
        }
        return d.next;
    }
}