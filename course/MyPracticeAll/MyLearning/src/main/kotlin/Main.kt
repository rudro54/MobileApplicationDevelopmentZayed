package cs473.edu.miu

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")
    //create a new  variable

    //var courseOne = "Kotlin Fundamentals"
    //var courseTwo:String = "Kotlin Fundamentals"
    var course:String = "Kotlin Fundamentals"

    var number:Int = 10
    number =20
    println(number)
    println("the number is $number")
    println("the number is "+number)
    println("the course is ${course.uppercase()}")
    // working with Boolean

    var isCourseActive :Boolean = true

    // keyword val

    val mdpScore =89
    //mdpscore=90 // it can not be reassigned
    println(mdpScore)

    val waterLevel:Double = 70.23
    val height : Float = 170.5F
    //create a collection of data
    //java list / arraylist

    val names = listOf("Zayed","Aurin", "Zafirah", "Zyva") // it creates immutable list
    val miuCourses = mutableListOf("Java", "Kotlin")
    miuCourses.add("Swift")
    println(miuCourses)









}