package fr.bred;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public int solve( String roman )
    {
        Map<Character, Integer> conversion = new HashMap<>();
        conversion.put('M', 1000);
        conversion.put('D', 500);
        conversion.put('C', 100);
        conversion.put('L', 50);
        conversion.put('X', 10);
        conversion.put('V', 5);
        conversion.put('I', 1);
        int len = roman.length();
        int result = conversion.get(roman.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (conversion.get(roman.charAt(i)) >= conversion.get(roman.charAt(i + 1)))
                result += conversion.get(roman.charAt(i));
            else
                result -= conversion.get(roman.charAt(i));
        }
        return result;
    }
}
