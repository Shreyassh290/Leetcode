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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode r1=rev(l1);
     ListNode r2=rev(l2);
     ListNode ans=new ListNode(0);
     ListNode temp,temp1,temp2;
     temp=ans;
     temp1=r1;
     temp2=r2;
     int c=0;
     while(temp1!=null && temp2!=null){
        int sum=c;
        int v=temp1.val+temp2.val;
        sum+=v;
        c=sum/10;
        sum=sum%10;
        
        ListNode n=new ListNode(sum);
        temp.next=n;
        temp=temp.next;
        temp1=temp1.next;
        temp2=temp2.next;
     } 
      while(temp1!=null){
        int v=temp1.val;
        int sum=c;
        sum+=v;
        c=sum/10;
        sum=sum%10;
        
        ListNode n=new ListNode(sum);
        temp.next=n;
        temp=temp.next;
        temp1=temp1.next;
      } 
      while(temp2!=null){
        int v=temp2.val;
        int sum=c;
        sum+=v;
        c=sum/10;
        sum=sum%10;
        
        ListNode n=new ListNode(sum);
        temp.next=n;
        temp=temp.next;
        temp2=temp2.next;
      
      }
      if (c != 0) {
      temp.next = new ListNode(c);
      }
      return rev(ans.next);

    }
}