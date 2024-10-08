class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0;
        int j=0;
        int c=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                c++;
            }
            else j++;
        }
        return c==n?true:false;
    }
}