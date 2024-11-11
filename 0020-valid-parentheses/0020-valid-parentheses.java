class Solution {
    public HashMap<Character, Character> map;
    public Solution(){
        this.map = new HashMap<Character, Character>();
        this.map.put(']','[');
        this.map.put(')','(');
        this.map.put('}','{');
    }
    public boolean isValid(String s) {
        Stack <Character> stk = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            
            if (this.map.containsKey(c)){
                char top = stk.empty() ? '0' : stk.pop();
                
                if (top!=map.get(c)){
                    return false;
                } }
            else {
                    stk.push(c);
                }
            }
         return stk.isEmpty();
    }
}
        
    
