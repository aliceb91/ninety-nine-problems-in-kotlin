package lists

class P13 {

    fun encode(elements: List<Char>): List<Pair<Int, Char>> {
        return elements.fold(mutableListOf<Pair<Int, Char>>()) {sum, element ->
            if (sum.isEmpty() || sum.last().second != element) {
                sum.add(Pair(1, element))
            } else {
                sum[sum.count() - 1] = Pair(sum.last().first + 1, element)
            }
            sum
        }
            .toList()
    }
}