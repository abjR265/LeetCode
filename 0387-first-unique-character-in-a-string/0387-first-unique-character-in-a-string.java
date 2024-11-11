class Solution {
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        
        // First pass: Count frequency of each character.
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        
        // Second pass: Find the first unique character.
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
