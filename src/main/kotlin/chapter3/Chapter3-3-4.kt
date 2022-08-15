package chapter3


// 확장 함수는 오버라이드할 수 없다.

open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {
    override fun click() {
        println("Button Clicked")
    }
}

fun main() {
    val view: View = Button()

    // 오버라이드 되어 Button Clicked 호출
    view.click()

    view.showOff() // I'm a View
    // 확장 함수 오버라이드 불가능

}

fun View.showOff() = println("I'm a View")

fun Button.showOff() = println("I'm a Button!")