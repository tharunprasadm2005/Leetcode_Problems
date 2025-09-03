// Last updated: 03/09/2025, 10:09:08
class Solution {
    public int lengthOfLastWord(String s) {
        String regex="[,\\s\\.]";
        String[] words=s.split(regex);
        return words[words.length-1].length();
    }
}