package chapter3

// Kotlin Collections
fun main() {
    val set = hashSetOf(1, 7, 10)

    val list = arrayListOf(10, 7 , 53)

    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val strings = listOf("first", "second", "fourteenth")

    println(strings.last())

    val numbers = setOf(1, 14, 2)

    println(numbers.maxOrNull())

}