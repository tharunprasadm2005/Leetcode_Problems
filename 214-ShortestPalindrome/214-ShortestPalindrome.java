// Last updated: 03/09/2025, 10:08:05
class Solution {
    public String shortestPalindrome(String s) {
        String res=new StringBuilder(s).reverse().toString();
        for(int i=0;i<res.length();i++){
            if(s.startsWith(res.substring(i))){
                return res.substring(0,i)+s;
            }
        }
        return res+s;
    }
}