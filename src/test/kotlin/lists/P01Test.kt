package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P01Test {

    @Test
    fun `it returns the only element in a single element list`() {
        val underTest = P01()
        val expected1: Int = 1
        val expected2: Int = 2
        val result1: Int = underTest.lastElement(listOf(1))
        val result2: Int = underTest.lastElement(listOf(2))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it returns the last element in a multi element list`() {
        val underTest = P01()
        val expected1: Int = 4
        val expected2: Int = 8
        val result1: Int = underTest.lastElement(listOf(3, 4))
        val result2: Int = underTest.lastElement(listOf(5, 6, 7, 8))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }
}