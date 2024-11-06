class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, m=0;
        HashSet<Character> hm = new HashSet<>();
        
        while (j<s.length()){
            if(!hm.contains(s.charAt(j))){
                 hm.add(s.charAt(j));
                 j++;
                 m = Math.max(hm.size(), m);
            } else{
                hm.remove(s.charAt(i));
                i++;  
                } 
         }
        
        return m;
    }
}