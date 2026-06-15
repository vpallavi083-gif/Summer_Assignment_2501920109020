class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode a = head;
        ListNode b = head;
        
      while (a != null && a.next != null) {
            b = b.next;          
            a = a.next.next;    

            if (b == a) {
                return true;         
            }
        }

        return false;                 
    }
}
