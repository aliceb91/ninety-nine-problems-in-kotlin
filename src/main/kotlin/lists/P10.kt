package lists

class P10 {

    fun encode(elements: List<Char>): List<Pair<Int, Char>> {
        return elements
            .fold(mutableListOf<MutableList<Char>>()) {sum, element ->
            if (sum.isEmpty() || sum.last().last() != element) {
                sum.add(mutableListOf(element))
            } else {
                sum.last().add(element)
            }
            sum
            }
            .map {
                Pair(it.count(), it[0])
            }
    }
}