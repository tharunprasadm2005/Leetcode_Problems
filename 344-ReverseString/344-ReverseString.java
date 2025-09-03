// Last updated: 03/09/2025, 10:07:44
class Solution {
  public void reverseString(char[] s) {
    int l = 0;
    int r = s.length - 1;

    while (l < r) {
      char temp = s[l];
      s[l++] = s[r];
      s[r--] = temp;
    }
  }
}