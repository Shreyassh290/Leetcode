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
    public ListNode mergeKLists(ListNode[] lists) {
        int n1=lists.length;
        ListNode s=new ListNode(0);
        ListNode s1=s;
        ListNode t;
        ListNode n=new ListNode(0);
        int l=0;
        for(int i=0;i<n1;i++){
          
          s1.next=lists[i];
          while(s1.next!=null){
            l++;
            s1=s1.next;
          }
        }
        s=s.next;
        s1=s;
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=s1.val;
            s1=s1.next;
        }
        Arrays.sort(arr);
        s1=n;
        for(int i=0;i<l;i++){
         t=new ListNode(arr[i]);
         s1.next=t;
         s1=s1.next;
        }
        return n.next;
    }
}