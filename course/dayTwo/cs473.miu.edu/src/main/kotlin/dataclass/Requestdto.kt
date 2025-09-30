package edu.miu.cs.cs425.dataclass

data class Requestdto(
    val name : String,
    val age : Int
)

fun main(){
    val requestdto = Requestdto(name="Zayed", age = 45)
    println(requestdto)
    println(requestdto.name)
    println(requestdto.age)
    val request2 = requestdto.copy()
    println(request2==requestdto)
    println(requestdto.equals(request2))
    println(request2===requestdto)

}
