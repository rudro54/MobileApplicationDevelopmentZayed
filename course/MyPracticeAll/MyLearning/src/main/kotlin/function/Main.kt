package cs473.edu.miu.function
// user defined function before main or after main

fun add(number1 : Int, number2 : Int):Int {
    return number1+number2
}


fun addNumbers(number1: Int=0, number2: Int=0) : Int{
    return number1+number2

}

// variable arguments

fun addAll(vararg numbers: Int) : Int{
    var sum=0;
    for(number in numbers){
        sum+=number
    }
    return sum
}
//
//fun sub(number1: Int=1, number2: Int) : Int{
//    return number1 - number2
//}

//single expression function  remove brace, remove return type put equal and remove return

fun sub(number1:Int=1, number2: Int)=number1-number2
fun displayMessage(message:String)=println(message)

 // is it possible to store a function in a variable
// you have to put double call => function reference operator ::
// function can be reference by a variable




fun main() {
    println(add(10, 30))
    println(addNumbers(10,20))
    println(addNumbers())
    println(addNumbers(5))
    println(addAll())
    println(addAll(10,20,30))
    println(sub(number2=10)) // 1-10
    displayMessage("go go go ")
    println(displayMessage("Go To Hell !!"))

}



// we can keep one function inside another function
// inner function acts like a auxilary call



