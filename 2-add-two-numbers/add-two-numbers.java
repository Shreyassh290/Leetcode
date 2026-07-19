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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l=new ListNode(0);
    ListNode t=l;
    ListNode t1=l1;
    ListNode t2=l2;
    int c=0;
    while(t1!=null && t2!=null){
     int sum=c;
     sum+=t1.val+t2.val;
     c=sum/10;
     sum=sum%10;
     ListNode n=new ListNode(sum);
     t.next=n;
     t=t.next;
     t1=t1.next;
     t2=t2.next;
    }
    while(t1!=null){
        int sum=c;
        
        sum+=t1.val;
        c=sum/10;
        sum=sum%10;
        ListNode n=new ListNode(sum);
        t.next=n;
        t=t.next;
        t1=t1.next;
    }
    while(t2!=null){
        int sum=c;
        
        sum+=t2.val;
        c=sum/10;
        sum=sum%10;
        ListNode n=new ListNode(sum);
        t.next=n;
        t=t.next;
        t2=t2.next;
    }
    if(c>0){
        ListNode n=new ListNode(c);
        t.next=n;
        t=t.next; 
    }
    return l.next;
    }

}