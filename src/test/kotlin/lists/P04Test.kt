package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P04Test {

    @Test
    fun `given a single element list, it returns 1`() {
        val underTest = P04()
        val expected: Int = 1
        val result1: Int = underTest.elementCount(listOf(1))
        val result2: Int = underTest.elementCount(listOf(2))
        assertEquals(expected, result1)
        assertEquals(expected, result2)
    }

    @Test
    fun `given elements of varying lengths, it returns their lengths as integers`() {
        val underTest = P04()
        val expected1: Int = 3
        val expected2: Int = 4
        val result1: Int = underTest.elementCount(listOf(1, 2, 3))
        val result2: Int = underTest.elementCount(listOf(4, 5, 6, 7))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P04()
        val expected: Int = 6
        val result: Int = underTest.elementCount(listOf(1, 1, 2, 3, 5, 8))
        assertEquals(expected, result)
    }
}