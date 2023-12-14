package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P03Test {

    @Test
    fun `given a single element list and an n of 1, it returns the only element`() {
        val underTest = P03()
        val expected1: Int = 1
        val expected2: Int = 2
        val result1: Int = underTest.nthElement(0, listOf(1))
        val result2: Int = underTest.nthElement(0, listOf(2))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given lists of varying length, it returns the specified nth character`() {
        val underTest = P03()
        val expected1: Int = 3
        val expected2: Int = 9
        val result1: Int = underTest.nthElement(2, listOf(1, 2, 3, 4, 5))
        val result2: Int = underTest.nthElement(4, listOf(5, 6, 7, 8, 9, 10, 11))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P03()
        val expected: Int = 2
        val result: Int = underTest.nthElement(2, listOf(1, 1, 3, 5, 8))
    }
}