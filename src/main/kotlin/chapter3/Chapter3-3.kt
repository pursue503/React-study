package chapter3

// 3.3 메소드를 다른 클래스에 추가 : 확장 함수와 프로퍼티

// String  마지막 문자를 돌려주는 메소드를 만들어봅니다.

fun String.lastChar () : Char = this[length - 1]

fun main() {

    val str = "kotlin"

    // result => n
    println(str.lastChar())

}
