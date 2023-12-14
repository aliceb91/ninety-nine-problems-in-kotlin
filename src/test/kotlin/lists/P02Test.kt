package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P02Test {

    @Test
    fun `given a list of two elements, it returns the first element`() {
        val underTest = P02()
        val expected1: Int = 1
        val expected2: Int = 3
        val result1: Int = underTest.penultimateElement(listOf(1, 2))
        val result2: Int = underTest.penultimateElement(listOf(3, 4))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given lists of varying lengths, it returns the penultimate element`() {
        val underTest = P02()
        val expected1: Int = 4
        val expected2: Int = 8
        val result1: Int = underTest.penultimateElement(listOf(1, 2, 3, 4, 5))
        val result2: Int = underTest.penultimateElement(listOf(6, 7, 8, 9))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P02()
        val expected: Int = 5
        val result: Int = underTest.penultimateElement(listOf(1, 1, 2, 3, 5, 8))
        assertEquals(expected, result)
    }
}