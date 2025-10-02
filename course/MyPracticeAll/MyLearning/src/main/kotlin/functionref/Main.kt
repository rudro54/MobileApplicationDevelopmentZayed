package cs473.edu.miu.functionref

fun add(number1:Int,number2:Int)=number1+number2

fun main() {
    val addFunction = ::add // it is function reference operator
    println(add(10,20))
    println(addFunction(1,2))

    val substructNumbers = {
            number1:Int,number2:Int->number1-number2
    }

    println(substructNumbers(1,2))


}

// lambda means function with no name


