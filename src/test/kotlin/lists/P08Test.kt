package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P08Test {

    @Test
    fun `given a list of the same character, it returns a list of that character`() {
        val underTest = P08()
        val expected1: List<Char> = listOf('a')
        val expected2: List<Char> = listOf('b')
        val result1: List<Char> = underTest.compress(listOf('a'))
        val result2: List<Char> = underTest.compress(listOf('b'))
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given multiple lists of characters, it removes the consecutive characters`() {
        val underTest = P08()
        val expected1: List<Char> = "abcdaeafg".toList()
        val expected2: List<Char> = "guidhjgy".toList()
        val result1: List<Char> = underTest.compress("aaabbcccccccddaaaaeeeeeaaafffffggg".toList())
        val result2: List<Char> = underTest.compress("ggguuidddhhhjjjjjjjjgggyyy".toList())
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it handles the example data`() {
        val underTest = P08()
        val expected: List<Char> = "abcade".toList()
        val result: List<Char> = underTest.compress("aaaabccaadeeee".toList())
        assertEquals(expected, result)
    }
}