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
    static int size(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    static ListNode rev(ListNode head){
        ListNode cur = head, prev = null;
        while(cur != null){
            ListNode nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
       int s=size(head);
       if(head == null || left == right)
            return head;
       ListNode dummy1=new ListNode(0);
       ListNode dummy2=new ListNode(0);
       ListNode dummy3=new ListNode(0);
       ListNode temp=head;
       ListNode temp1=dummy1;
       ListNode temp2=dummy2;
       ListNode temp3=dummy3;
       for(int i=1;i<left;i++){
         ListNode n=new ListNode(temp.val);
         temp1.next=n;
         temp1=temp1.next;
         temp=temp.next;
       } 
       for(int i=left;i<=right;i++){
        ListNode n=new ListNode(temp.val);
        temp2.next=n;
        temp2=temp2.next;
        temp=temp.next;
       }
       
        for(int i=right+1;i<=s;i++){
        ListNode n=new ListNode(temp.val);
        temp3.next=n;
        temp3=temp3.next;
        temp=temp.next; 
        }
        dummy1 = dummy1.next;
        dummy2 = rev(dummy2.next);
        if(dummy1==null){
            ListNode ans=dummy2;
            temp=ans;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=dummy3.next;
            return ans;
        }
        temp1 = dummy1;
    while(temp1.next != null){
    temp1 = temp1.next;
    }

    temp1.next = dummy2;

    while(temp1.next != null){
    temp1 = temp1.next;
    }

    temp1.next = dummy3.next;

    return dummy1;
    }
}