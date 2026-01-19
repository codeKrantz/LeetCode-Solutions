public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        //use first word as the starting prefix and remove letters when needed
        String pref = strs[0];
        int prefLength = pref.length();
        //start at the 1st index
        for(int i = 1; i < strs.length; i++){
            String current = strs[i];
            //loop to edit the prefix
            while(prefLength > current.length() || !pref.equals(current.substring(0, prefLength))){
                prefLength--;
                //logic check
                if(prefLength == 0){
                    return "";
                }
                pref = pref.substring(0, prefLength);
            }
        }
        return pref;
    }
}