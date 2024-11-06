class Solution {
     private Map<String, List<String>> map = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        // If we already computed this substring, return the cached result
        if (map.containsKey(s)) {
            return map.get(s);
        }
        
        List<String> result = new ArrayList<>();

        // Base case: If the entire string is a valid word in the dictionary, add it as a possible result
        if (wordDict.contains(s)) {
            result.add(s);
        }

        // Loop through each prefix of the string
        for (int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i); // The prefix of the string

            // If the prefix is in the dictionary, proceed to break the remaining part
            if (wordDict.contains(left)) {
                // Recursively get all possible sentences for the suffix
                List<String> sublist = wordBreak(s.substring(i), wordDict);

                // Construct sentences by appending the current prefix to each sentence in the suffix results
                for (String sen : sublist) {
                    result.add(left + " " + sen);
                }
            }
        }

        // Store the result in the memoization map for the current substring
        map.put(s, result);
        return result;
    }

}