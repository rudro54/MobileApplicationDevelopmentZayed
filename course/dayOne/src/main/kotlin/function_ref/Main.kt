package edu.miu.function_ref
//fun add(number1:Int, number2:Int)=number1+number2
fun main() {
    //the function add() is stored in a variable call addFunction .
    var fn = ::add // function reference operator
    var sub = {a: Int, b: Int ->
        a - b
    }

    println(fn(1, 2))
    println(sub(1, 2))
}

fun add(a: Int, b: Int) = a + b