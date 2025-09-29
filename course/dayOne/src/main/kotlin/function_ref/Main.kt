package edu.miu.function_ref

fun main() {
    var fn = ::add // function reference operator
    var sub = {a: Int, b: Int ->
        a - b
    }

    println(fn(1, 2))
    println(sub(1, 2))
}

fun add(a: Int, b: Int) = a + b