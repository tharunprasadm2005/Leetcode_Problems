// Last updated: 03/09/2025, 10:08:50
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(1000, head); 
        ListNode cur = ans; 

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { 
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) { 
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return ans.next; 
    }
}