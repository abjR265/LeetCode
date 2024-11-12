class Solution {
    public boolean isPalindrome(int x) {
        if (x==0) return true;
        int revx = 0;
        
        if(x < 0 || x%10==0) return false;
        
        while(x > revx){
            revx = 10*revx + x%10;
            x/= 10;  
        }
        return x==revx || x==revx/10;
        
        
    }
}