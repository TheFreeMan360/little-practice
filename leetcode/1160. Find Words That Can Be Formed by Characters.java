class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsFreq = new int[26];
        for(int i = 0 ; i < chars.length() ; ++i) 
            ++charsFreq[chars.charAt(i) - 97];
        
        int ans = 0;
        for(String word : words){
            int[] wFreq = new int[26];
            boolean isGood = true;

            for(int i = 0 ; i < word.length() ; ++i){
                int currChar = word.charAt(i)- 97; 
                ++wFreq[currChar];
                if(wFreq[currChar] > charsFreq[currChar]){
                    isGood = false;
                    break;
                }
            }

            if(isGood) ans += word.length();
        }

        return ans;
    }
}