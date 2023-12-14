package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P06Test {

    @Test
    fun `given a single element list, it returns true`() {
        val underTest = P06()
        val expected: Boolean = true
        val result1: Boolean = underTest.isPalindrome(listOf(1))
        val result2: Boolean = underTest.isPalindrome(listOf(2))
        assertEquals(expected, result1)
        assertEquals(expected, result2)
    }

    @Test
    fun `given multiple lists that are not palindromic, it returns false`() {
        val underTest = P06()
        val expected: Boolean = false
        val result1: Boolean = underTest.isPalindrome(listOf(1, 2, 3, 4, 5))
        val result2: Boolean = underTest.isPalindrome(listOf(6, 7, 8))
        assertEquals(expected, result1)
        assertEquals(expected, result2)
    }

    @Test
    fun `given multiple palindromic lists, it returns true`() {
        val underTest = P06()
        val expected: Boolean = true
        val result1: Boolean = underTest.isPalindrome(listOf(2, 3, 5, 3, 2))
        val result2: Boolean = underTest.isPalindrome(listOf(4, 6, 8, 6, 4))
        assertEquals(expected, result1)
        assertEquals(expected, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P06()
        val expected: Boolean = true
        val result: Boolean = underTest.isPalindrome(listOf(1, 2, 3, 2, 1))
        assertEquals(expected, result)
    }
}