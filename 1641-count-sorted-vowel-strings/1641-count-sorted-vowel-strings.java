class Solution {
    public int countVowelStrings(int n) {
        int[] vowel=new int[5];
        Arrays.fill(vowel,1);
        
        for(int i=1;i<=n;i++)
            for(int j=1;j<5;j++)
                vowel[j]=vowel[j]+vowel[j-1];
        
        return vowel[4];
    }
}