package lists

class P07 {

    fun flattenElements(elements: List<Any>): List<Any> {
        return elements.flatMap {
            if (it is List<*>) {
                flattenElements(it as List<Any>)
            } else {
                listOf(it)
            }
        }
    }
}