package fr.bred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution
{
    public String solve( String l1, String l2 )
    {
        List<Integer> array1 = l1.length() > 0 ? Arrays.stream(l1.split("->")).map(this::toInt).collect(Collectors.toList()): new ArrayList<>();
        List<Integer> array2 = l2.length() > 0 ? Arrays.stream(l2.split("->")).map(this::toInt).collect(Collectors.toList()): new ArrayList<>();
        List<String> res = new ArrayList<>();
        array1.forEach(
                element -> {
                    while(array2.size() > 0 && array2.get(0) <= element) {
                        res.add(array2.get(0).toString());
                        array2.remove(0);
                    }
                    res.add(element.toString());
                }
        );
        res.addAll(array2.stream().map(num -> num.toString()).collect(Collectors.toList()));
        return String.join("->", res);
    }

    private Integer toInt(String num) {
        return Integer.parseInt(num);
    }
}
