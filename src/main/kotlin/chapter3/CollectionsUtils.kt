package chapter3


// 3-3 에서 사용하는 컬렉션에 대한 확장함수 정의

// 모든 타입을 사용 할 수 있는 joinToString

fun <T> Collection<T>.joinToString(
    collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""
) : String {
    // StringBuilder
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

// String Type 의 Collection 만 사용할 수 있는 확장 함수

fun Collection<String>.join(
     separator: String = ", ", prefix: String = "", postfix: String = ""
) = joinToString(separator, prefix, postfix)

