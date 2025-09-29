package edu.miu.nullable

fun main() {
    var courseName = "MDP"
    courseName =  "MPP"
    // cannot assign null
    // courseName = null

    var car: String? = null
    car = "toyota"
    println(car?.uppercase())
    println(car?.length ?: 0)
    println(car!!.length) // tell compiler not to check null
}