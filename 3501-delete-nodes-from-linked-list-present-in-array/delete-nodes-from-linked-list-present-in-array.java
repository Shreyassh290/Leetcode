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
    public ListNode modifiedList(int[] nums, ListNode head) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        ListNode t=head;
        while(t!=null){
            h.add(t.val);
            t=t.next;
        }
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                h.remove(nums[i]);
            }
        }
        ListNode h1=new ListNode(0);
        t=h1;
        while(head!=null){
            if(h.contains(head.val)){
                ListNode n=new ListNode(head.val);
                t.next=n;
                t=t.next;
            }
            head=head.next;
        }
        return h1.next;
    }
}