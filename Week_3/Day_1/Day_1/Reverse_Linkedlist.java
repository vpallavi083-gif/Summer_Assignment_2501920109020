class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr;
        curr=head;
        ListNode next;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
        
    }
}
