// Last updated: 03/09/2025, 10:08:24
class Solution {
  public boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
        ++l;
      while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
        --r;
      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
        return false;
      ++l;
      --r;
    }

    return true;
  }
}