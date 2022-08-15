package chapter3

// 3-2 함수를 호출하기 쉽게 만들기

fun main() {
    val list = listOf(1, 2, 3)

    // default to String [1, 2, 3]
    println(list)

    // joinToString 직접 구현
    // result -> (1; 2; 3)
    // 자바는 어떤 파라미터인지 보기가 힘듦
    println(joinToString(list, "; ", "(", ")"))

    // 코틀린 방식 순서에 상관없이 지정해서 넣어줄 수 있음
    println(joinToString(collection = list, prefix = "(", postfix = ")", separator = "; "))

    /*
        자바는 오버로딩 하게되면 매번 함수를 새로 만들고 디폴트 값을 못줌
        거기에 대한 주석도 증가 하게 됨
        코틀린에서는 기본값을 주고 오버로딩 하지 않고 해당 값이 없으면 디폴트 값을 사용하게 가능
     */

    // 모든값을 다 새롭게 설정
    println(joinToStringV2(list, ", ", "", ""))

    println(joinToStringV2(list))

    // 일부만 설정
    println(joinToStringV2(list, "; "))

    println(joinToStringV2(list, postfix = ";", prefix = "#"))


}

// 코틀린의 디폴트 값을 안쓴경우
fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {

    // StringBuilder
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

fun <T> joinToStringV2(collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""): String {

    // StringBuilder
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}