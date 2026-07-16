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
        ListNode cur,nex,prev;
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
    public ListNode doubleIt(ListNode head) {
       ListNode r=rev(head);
       ListNode temp=r;
       int c=0;
       while(temp!=null){
        int v=temp.val;
        v*=2;
        int sum=v+c;
        temp.val=sum%10;
        c=sum/10;
        if(temp.next==null) break;
        temp=temp.next;
       }
       if(c>0){
        temp.next= new ListNode(c);
       }
       r=rev(r);
       return r;
    }
}