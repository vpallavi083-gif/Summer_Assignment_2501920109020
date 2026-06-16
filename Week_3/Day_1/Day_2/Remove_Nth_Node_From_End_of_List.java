class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = new ListNode(0);
        a.next = head;

        ListNode x = a;
        ListNode y = a;

        for (int i = 0; i <= n; i++) {
            x = x.next;
        }

        while (x != null) {
            x = x.next;
            y = y.next;
        }

        y.next = y.next.next;

        return a.next;
    }
}
