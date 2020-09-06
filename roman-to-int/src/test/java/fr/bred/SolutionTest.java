package fr.bred;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest
{
    @Test
    public void test_solution_1() {
        assertEquals(3, new Solution().solve("III"));
    }

    @Test
    public void test_solution_2() {
        assertEquals(4, new Solution().solve("IV"));
    }

    @Test
    public void test_solution_3() {
        assertEquals(40, new Solution().solve("XL"));
    }

    @Test
    public void test_solution_4() {
        assertEquals(57, new Solution().solve("LVII"));
    }

    @Test
    public void test_solution_5() {
        assertEquals(1994, new Solution().solve("MCMXCIV"));
    }
}
