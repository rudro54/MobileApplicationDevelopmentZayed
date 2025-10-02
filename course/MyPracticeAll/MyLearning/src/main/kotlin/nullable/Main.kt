package cs473.edu.miu.nullable

fun main(){
    var courseName = "MDP"
    courseName = "MPP"
    //courseName = null
    //println(courseName.uppercase())

    // how to make a variable nullable ??
    //var car:Nothing? = null
    var car : String?="Tesla" // the variable car is nullable
    //car = "Toyota" // eita TOYOTa dekhabe
    car = null
    //println(car?.length ?:0)
//   if (car!=null){
//        println(car!!.length)
//    }
    //println(car!!.length)

    //println(car?.uppercase()) // if the car is not null then uppercase will be executed
    // ?. safe call operator => ?.

    // var data = null // nothing type










}