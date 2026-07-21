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
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode insertionSortList(ListNode head) {
       ListNode temp=head;
      int s=size(head);
      int arr[]=new int[s];
      for(int i=0;i<s;i++){
        arr[i]=temp.val;
        temp=temp.next;
      }
      Arrays.sort(arr);
      ListNode r=new ListNode(0);
      temp=r;
      for(int i=0;i<s;i++){
        ListNode n=new ListNode(arr[i]);
        temp.next=n;
        temp=temp.next;
      }
      return r.next;
    }
}