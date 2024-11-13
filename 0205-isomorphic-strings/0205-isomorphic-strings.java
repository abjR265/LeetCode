class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m = new HashMap<>();
        for (int i=0; i<s.length();i++){
            if (m.containsKey(s.charAt(i))){
                if (t.charAt(i) != m.get(s.charAt(i))) return false;
            }else {
                    if (m.containsValue(t.charAt(i))) return false; 
                    
                    m.put(s.charAt(i), t.charAt(i));
                }
        }
            return true;
        }
            
        
}
        
    
