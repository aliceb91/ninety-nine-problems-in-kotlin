package lists

class P12 {

    fun decode(elements: List<Pair<Int, Char>>): List<Char> {
        return elements.map {
                val list = mutableListOf<Char>()
                 for (x in 1..it.first + 1) {
                     list.add(it.second)
                 }
                list
            }
            .flatten()
    }
}