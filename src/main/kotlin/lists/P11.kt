package lists

class P11 {

    fun encodeModified(elements: List<Char>): List<Any> {
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
                if (it.count() == 1) {
                    it[0]
                } else {
                    Pair(it.count(), it[0])
                }
            }
    }
}