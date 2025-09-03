// Last updated: 03/09/2025, 10:07:29
class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int cntFive = 0;
        int cntTen = 0;
        for(int i : bills)
        {
            if(i == 5)
            {
                cntFive++;
            }
            else if(i == 10)
            {
                if(cntFive >= 1)
                {
                    cntFive--;
                }
                else
                {
                    return false;
                }
                cntTen++;
            }
            else
            {
                if((cntTen >= 1 && cntFive >= 1) || cntFive >= 3)
                {
                    if(cntTen >= 1 && cntFive >= 1)
                    {
                        cntTen--;
                        cntFive--;
                    }
                    else
                    {
                        cntFive = cntFive - 3;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}