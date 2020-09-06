package fr.bred;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest
{
    @Test
    public void test_solution_1() {
        assertEquals("1->1->2->3->4->4", new Solution().solve("1->2->4", "1->3->4"));
    }

    @Test
    public void test_solution_2() {
        assertEquals("1->2->4", new Solution().solve("1->2->4", ""));
    }

    @Test
    public void test_solution_3() {
        assertEquals("", new Solution().solve("", ""));
    }

    @Test
    public void test_solution_4() {
        assertEquals("1->1->2->4->7->9", new Solution().solve("1->2->4->7->9", "1"));
    }

    @Test
    public void test_solution_5() {
        assertEquals("1->1->2->3->4->6->7->8->9->10->13", new Solution().solve("1->2->4->7->9", "1->3->6->8->10->13"));
    }
}
