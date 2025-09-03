// Last updated: 03/09/2025, 10:09:57
class Solution {
    public int reverse(int x) {
        boolean isNegativeNumber=false;

        if(x<0){
        isNegativeNumber=true;
        x=x*-1;

        }
        System.out.print(x);
        double rev=0;
        while(x>0){
            int temp=x%10;
            if(Integer.MAX_VALUE<=(rev*10+temp )|| (rev*10+temp )<=Integer.MIN_VALUE){
                rev=0;
                break;
            }
            rev=rev*10+temp;
            x=x/10;
        } 

        if(isNegativeNumber)return (int)rev*-1;
        return (int) rev;
        
    }
}