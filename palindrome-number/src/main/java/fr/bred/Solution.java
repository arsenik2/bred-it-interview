package fr.bred;

public class Solution
{
    public boolean solve( int number )
    {
        if(number < 0) return false;
        return revert(number, 0) == number;
    }

    private int revert(int number, int res) {
        if(number<1) return res;
        return revert(number / 10, res * 10 + number % 10);
    }
}
