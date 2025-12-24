public class LongestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s) {
        String current = "";
        int longest = 0;
        for(int i = 0; i < s.length(); i++){
            //New character
            String ch = s.substring(i, i + 1);

            if (!current.contains(ch)) {
                current += ch;
            } else {
                // keep best so far
                longest = Math.max(longest, current.length());

                // remove everything up to and including the previous occurrence of ch
                int cutIndex = current.indexOf(ch) + 1;
                current = current.substring(cutIndex) + ch;
            }
        }
        return Math.max(longest, current.length());
        
    }
}