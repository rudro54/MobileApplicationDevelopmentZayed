package cs473.edu.miu.array

fun main(){
    // val numbers:Array<Int> = arrayOf(1,2,3)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val miuCourses = arrayOf("Java", "Kotlin","Swift")
    println(numbers.contentToString())
    println(miuCourses.contentToString())
        // use a for loop to display the elements

    for(elements in numbers){
        println(elements)
    }

    // another way to use the for loop
    numbers.forEach {
        data->println(data)
    }
    //usage of range opearator, range operator is inclusive of both ends (..)
    for(i in 1 .. 10){ // 1..10 rest will auto
        println(i)
    }

    // usage of range operator with steps

    for(i in 1 ..10 step 2){
        println(i) // 1 3 5 7 9
    }

    // usage of range oprator with down to

   for(i in 10 downTo 1 ){
       println(i) // 10 9 8 7 6 5 4 3 2 1
   }

   for((index,value) in numbers.withIndex()){
       println("the element at $index is $value")
   }

    // see slide 36

    // arrays of primitive type

    val scores : IntArray = intArrayOf(98,85,70)
    val marks : FloatArray = floatArrayOf(97.5f,82.5f,67.5f )
    val weather : DoubleArray = doubleArrayOf(28.3,29.3,30.1)





}