package edu.miu.cs.cs425.higherorderfunction

// expect many questions from higher order function

fun add(number1: Int, number2: Int): Int = number1 + number2
fun sub(number1: Int, number2: Int): Int = number1 - number2

fun operation(number1:Int, number2: Int,myFun:(Int,Int)->Int):Int{

    return myFun(10,20)
}


fun main(){
    val x=::add
    val y =::sub
    println(operation(10,20, myFun = ::add)) // pass add function as parameter to operation function
    println(operation(20,10, myFun = ::sub))
    println(operation(20,10, myFun ={number1,number2->number1*number2}))
    //operation(20,10){
        //number1,number2->number1*number2
    //}

    println(operation(20,10){number1,number2->number1*number2})
}