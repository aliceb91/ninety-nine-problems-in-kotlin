package lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class P11Test {

    @Test
    fun `it handles the example data`() {
        val underTest = P11()
        val expected: List<Any> = listOf(Pair(4, 'a'), 'b', Pair(2, 'c'), Pair(2, 'a'), 'd', Pair(4, 'e'))
        val result: List<Any> = underTest.encodeModified("aaaabccaadeeee".toList())
        assertEquals(expected, result)
    }
}