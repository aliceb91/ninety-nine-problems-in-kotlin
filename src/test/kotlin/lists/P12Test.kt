package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P12Test {

    @Test
    fun `it handles the example data`() {
        val underTest = P12()
        val expected: List<Char> = "aaaabccaadeeee".toList()
        val result: List<Char> = underTest.decode(listOf(
            Pair(4, 'a'),
            Pair(1, 'b'),
            Pair(2, 'c'),
            Pair(2, 'a'),
            Pair(1, 'd'),
            Pair(4, 'e')
        ))
    }
}