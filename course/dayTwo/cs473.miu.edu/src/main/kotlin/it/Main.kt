package edu.miu.cs.cs425.it

// string are immutable
// data types are object type

fun main() {

    val square : (Int)->Unit={

        println(it*it)

    }

    square(10)

}