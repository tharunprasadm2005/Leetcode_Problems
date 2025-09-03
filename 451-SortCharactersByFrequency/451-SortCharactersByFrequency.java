// Last updated: 03/09/2025, 10:07:42
class Solution {
    public String frequencySort(String s) {
        int[] freqCount = new int[128];
        for (char ch : s.toCharArray()) {
            freqCount[ch]++;
        }
        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            int maxFreq = 0;
            char maxChar = 0;
            for (int i = 0; i < 128; i++) {
                if (freqCount[i] > maxFreq) {
                    maxFreq = freqCount[i];
                    maxChar = (char) i;
                }
            }
            for (int j = 0; j < maxFreq; j++) {
                result.append(maxChar);
            }
            freqCount[maxChar] = 0;
        }
        return result.toString();
    }
}