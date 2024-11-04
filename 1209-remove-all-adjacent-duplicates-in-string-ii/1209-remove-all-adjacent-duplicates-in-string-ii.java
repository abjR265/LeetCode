class Solution {
   public String removeDuplicates(String s, int k) {
    // Use a StringBuilder to store characters and an integer stack to track counts.
    StringBuilder sb = new StringBuilder();
    int[] count = new int[s.length()]; // Array to track counts of characters

    for (char c : s.toCharArray()) {
        sb.append(c); // Add the current character to StringBuilder
        int size = sb.length();

        if (size > 1 && sb.charAt(size - 1) == sb.charAt(size - 2)) {
            // If the current character is the same as the previous character, increment the count
            count[size - 1] = count[size - 2] + 1;
        } else {
            // Otherwise, start a new count for this character
            count[size - 1] = 1;
        }

        // If the count reaches k, remove the last k characters from StringBuilder
        if (count[size - 1] == k) {
            sb.delete(sb.length() - k, sb.length());
        }
    }

    return sb.toString(); // Return the final string
}

}