package edu.miu.array

fun main() {
    val nums: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val courses: Array<String> = arrayOf("Kotlin", "Java", "C#")

    println(nums.contentToString())
    println(courses.contentToString())

    for (num in nums) {
        println(num)
    }
    courses.forEach { n -> println(n) }

    println("range")
    for (i in 1..10) {
        println(i)
    }

    println("step")
    for (i in 2..10 step 2) {
        println(i)
    }

    println("downTo")
    for (i in 10 downTo 1) {
        println(i)
    }

    println("withIndex")
    for ((i, num) in nums.withIndex()) {
        println("$i $num")
    }
}