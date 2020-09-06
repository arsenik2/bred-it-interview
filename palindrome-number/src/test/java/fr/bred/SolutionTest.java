package fr.bred;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest
{
    @Test
    public void test_solution_1() {
        assertEquals(true, new Solution().solve(123321));
    }

    @Test
    public void test_solution_2() {
        assertEquals(false, new Solution().solve(-181));
    }

    @Test
    public void test_solution_3() {
        assertEquals(true, new Solution().solve(0));
    }

    @Test
    public void test_solution_4() {
        assertEquals(false, new Solution().solve(-4));
    }

    @Test
    public void test_solution_5() {
        assertEquals(false, new Solution().solve(10));
    }
}
