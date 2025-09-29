package edu.miu.when_exp

fun main() {
    val daysOfWeek = 3

    when (daysOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Unknown daysOfWeek")
    }

    val name = "John"
    when {
        name == "John" -> println("John")
        name == "Jack" -> println("Jack")
        name == "Jan" -> println("Jan")
        else -> println("unknown user")
    }
}