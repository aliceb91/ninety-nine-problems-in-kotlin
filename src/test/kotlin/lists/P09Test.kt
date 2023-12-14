package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P09Test {

    @Test
    fun `it handles the test data`() {
        val underTest = P09()
        val expected: List<List<Char>> = listOf(
            "aaaa".toList(),
            "b".toList(),
            "cc".toList(),
            "aa".toList(),
            "d".toList(),
            "eeee".toList()
        )
        val result: List<List<Char>> = underTest.pack("aaaabccaadeeee".toList())
        assertEquals(expected, result)
    }
}