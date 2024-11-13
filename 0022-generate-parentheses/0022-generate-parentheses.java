class Solution {
    public List<String> generateParenthesis(int n) {
         ArrayList<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0,0, n );
        return res;
    }
    
    public void backtrack( ArrayList<String> res,StringBuilder s, int lc, int rc, int n){
        if (s.length()==2*n){
            res.add(s.toString());
            return;
        }
        if (lc<n){
            s.append("(");
            backtrack(res, s, lc+1, rc, n);
            s.deleteCharAt(s.length()-1);
        }
        if (rc<lc){
             s.append(")");
            backtrack(res, s, lc, rc+1, n);
                        s.deleteCharAt(s.length()-1);

        }
    }
}