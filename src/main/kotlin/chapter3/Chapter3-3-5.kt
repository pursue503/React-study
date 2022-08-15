package chapter3


// 확장 프로퍼티

/*
    확장 프로퍼티를 사용 하면 기존 클래스에 대한 프로퍼티 형식의 구문으로 사용 할 수 있는 API 를 작성 할 수 있음
    프로퍼티라는 이름으로 불리지만 상태를 저장 할 수는 없다

 */

val String.lastChar: Char get () = this[length - 1]


var StringBuilder.lastChar: Char
    get () = get(length - 1)
    set(value: Char) {
        this.setCharAt(length -1, value)
    }


fun main() {
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'

    println(sb)

    println(sb.lastChar)
}