package edu.miu.arraylist

fun main() {
    // create a mutable list
    val names = arrayListOf("A", "B", "C", "D", "E", "F", "G", "H")

    println(names)
    names[0] = "Hello"
    println(names)
    names.clear()
    // println(names.first()) // this will throw error
    println(names.firstOrNull())

}