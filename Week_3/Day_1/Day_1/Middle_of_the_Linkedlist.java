class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        
      while (a != null && a.next != null) {
            b = b.next;          
            a = a.next.next;    

      }
        return b; 
    }
}
