class Solution {
   public String removeDuplicates(String s, int k) {
    StringBuilder sb = new StringBuilder();
    int[] count = new int[s.length()]; // Array to track counts of characters

    for (char c : s.toCharArray()) {
        sb.append(c);
        int size = sb.length();
        
        count[size - 1] = (size > 1 && sb.charAt(size - 1) == sb.charAt(size - 2)) ? count[size - 2] + 1 : 1;

        if (count[size - 1] == k) {
            sb.delete(size - k, size);
        }
    }

    return sb.toString();
}


}