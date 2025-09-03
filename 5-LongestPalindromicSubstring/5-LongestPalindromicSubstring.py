# Last updated: 03/09/2025, 10:10:00
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        def expand_around_center(left, right):
            
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            
            return s[left + 1:right]

        if len(s) == 0:
            return ""
        
        longest_palindrome = ""
        
        for i in range(len(s)):
            
            odd_palindrome = expand_around_center(i, i)
           
            even_palindrome = expand_around_center(i, i + 1)
            
            
            longest_palindrome = max(longest_palindrome, odd_palindrome, even_palindrome, key=len)
        
        return longest_palindrome