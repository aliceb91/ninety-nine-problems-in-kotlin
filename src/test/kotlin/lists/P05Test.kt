package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P05Test {

    @Test
    fun `given a single element list, it returns the same list`() {
        val underTest = P05()
        val expected1: List<Int> = listOf(1)
        val expected2: List<Int> = listOf(2)
        val result1: List<Int> = underTest.reverseList(listOf(1))
        val result2: List<Int> = underTest.reverseList(listOf(2))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given multiple lists, it returns those lists reversed`() {
        val underTest = P05()
        val expected1: List<Int> = listOf(5, 4, 3, 2, 1)
        val expected2: List<Int> = listOf(8, 7, 6)
        val result1: List<Int> = underTest.reverseList(listOf(1, 2, 3, 4, 5))
        val result2: List<Int> = underTest.reverseList(listOf(6, 7, 8))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P05()
        val expected: List<Int> = listOf(8, 5, 3, 1, 1)
        val result: List<Int> = underTest.reverseList(listOf(1, 1, 3, 5, 8))
        assertEquals(expected, result)
    }
}