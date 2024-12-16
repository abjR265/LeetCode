class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m-1, p2 = n-1, p = nums1.length-1;
       while (p>-1) {
        int t1 = p1 > -1 ? nums1[p1] : Integer.MIN_VALUE;
        int t2 = p2 > -1 ? nums2[p2] : Integer.MIN_VALUE;

        if (t1<t2){
            nums1[p]= nums2[p2];
            p2--;
        } else {
            nums1[p]=nums1[p1];
            p1--;
        }
        p--;
       }

    }
}
