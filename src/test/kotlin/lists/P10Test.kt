package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P10Test {

    @Test
    fun `it handles the test data`() {
        val underTest = P10()
        val expected: List<Pair<Int, Char>> = listOf(
            Pair(4, 'a'),
            Pair(1, 'b'),
            Pair(2, 'c'),
            Pair(2, 'a'),
            Pair(1, 'd'),
            Pair(4, 'e')
        )
        val result: List<Pair<Int, Char>> = underTest.encode("aaaabccaadeeee".toList())
        assertEquals(expected, result)
    }
}