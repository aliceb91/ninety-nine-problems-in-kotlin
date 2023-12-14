package lists

class P09 {

    fun pack(elements: List<Char>): List<List<Char>> {
        return elements.fold(mutableListOf<MutableList<Char>>()) {sum, element ->
                if (sum.isEmpty() || sum.last().last() != element) {
                    sum.add(mutableListOf(element))
                } else {
                    sum.last().add(element)
                }
                sum
            }
    }
}