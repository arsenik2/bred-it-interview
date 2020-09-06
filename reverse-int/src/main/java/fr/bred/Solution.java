package fr.bred;

public class Solution
{
    public int solve( int number )
    {
        if(number == 0) return 0;
        return revert(Math.abs(number), 0)*(Math.abs(number) / number);
    }

    public int revert(int number, int res) {
        if(number<1) return res;
        return revert(number / 10, res * 10 + number % 10);
    }
}
