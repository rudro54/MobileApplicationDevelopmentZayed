package edu.miu.cs.cs425.function

fun main(){

    val subtractNumbers : (Int, Int) -> Int = {
        firstNumber,secondNumber->if(firstNumber<secondNumber){
            secondNumber-firstNumber
    }else{
        firstNumber-secondNumber
    }




    }

    println(subtractNumbers(2,3))




}