package chapter3


fun main() {
    val list = listOf(1, 2, 3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))

    println(listOf("one", "two", "eight").join(" "))

}