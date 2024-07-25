import java.util.List;

class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        if (root == null) return new ListNode[k];
        int n = 0;
        for (ListNode tmp = root; tmp != null; tmp = tmp.next) n++;
        ListNode[] res = new ListNode[k];
        int r = n % k;
        // System.out.println(n+"   "+r);
        for (int i = 0; i < k && root != null; i++, r--) {
            res[i] = root;
            int c = n / k + (r > 0 ? 1 : 0);

            for (; c > 1 && root != null; c--) root = root.next;
            if (root != null) {
                ListNode next = root.next;
                root.next = null;
                root = next;
            }
        }
        return res;
    }
}