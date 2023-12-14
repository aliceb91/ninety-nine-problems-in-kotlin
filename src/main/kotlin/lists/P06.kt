package lists

class P06 {

    fun isPalindrome(elements: List<Int>): Boolean {
        return elements == elements.reversed()
    }
}