class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for (String e : word1)
            sb1.append(e);
        for (String e : word2)
            sb2.append(e);

        return sb1.toString().equals(sb2.toString());
    }
}