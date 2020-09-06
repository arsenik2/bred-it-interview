package fr.bred;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest
{
    @Test
    public void test_solution_1() {
        assertEquals(321, new Solution().solve(123));
    }

    @Test
    public void test_solution_2() {
        assertEquals(-45566, new Solution().solve(-66554));
    }

    @Test
    public void test_solution_3() {
        assertEquals(0, new Solution().solve(0));
    }

    @Test
    public void test_solution_4() {
        assertEquals(-4, new Solution().solve(-4));
    }
}
