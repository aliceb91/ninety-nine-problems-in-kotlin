package lists

class P08 {

    fun compress(elements: List<Char>): List<Char> {
        return elements.filterIndexed {index, it ->
            index - 1 < 0 || it != elements[index - 1]
        }
    }
}