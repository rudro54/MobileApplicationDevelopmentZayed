package edu.miu.function

fun main() {
    println("add(2, 3) = ${add(2, 3)}")
    println("add(10) = ${add(10)}")
    println("add() = ${add()}")
    println("add2(1, 2) = ${add2(1, 2)}")
    println("addAll(1, 2, 3, 4, 5) = ${addAll(1, 2, 3, 4, 5)}")
    println(greetUser("James"))
    println(displayMessage("hello world")) // return kotlin.Unit (void for other language)
}

fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun add2(a: Int, b: Int) = a + b

fun addAll(vararg nums: Int): Int {
    var sum = 0

    for (n in nums) {
        sum  += n
    }
    return sum
}

fun greetUser(name: String): String {
    val greeting = "Hello"

    fun buildMsg(s: String): String {
        return "$greeting $s"
    }
    return buildMsg(name)
}

fun displayMessage(message: String) = println(message)