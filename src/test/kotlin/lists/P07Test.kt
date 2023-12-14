package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P07Test {

    @Test
    fun `given an list with no list elements it returns the list`() {
        val underTest = P07()
        val expected1: List<Int> = listOf(1, 2, 3)
        val expected2: List<Int> = listOf(4, 5, 6, 7)
        val result1: List<Any> = underTest.flattenElements(listOf(1, 2, 3))
        val result2: List<Any> = underTest.flattenElements(listOf(4, 5, 6, 7))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given lists containing nested lists, it flattens these lists`() {
        val underTest = P07()
        val expected1: List<Int> = listOf(1, 2, 3, 4, 5)
        val expected2: List<Int> = listOf(6, 7 ,8, 9)
        val result1: List<Any> = underTest.flattenElements(listOf(1, 2, listOf(3, 4), 5))
        val result2: List<Any> = underTest.flattenElements(listOf(listOf(6, listOf(7, 8)), 9))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the test data`() {
        val underTest = P07()
        val expected: List<Int> = listOf(1, 1, 2, 3, 5, 8)
        val result: List<Any> = underTest.flattenElements(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
        assertEquals(expected, result)
    }
}