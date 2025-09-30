package edu.miu.cs.cs425.enum

enum class Coffee {
    Americano,Latte,Cappuccino, Espresso
}

fun main(){
    println(Coffee.Americano.name)
    println(
        Coffee.values().joinToString { it.name }
    )
    println(Coffee.valueOf(readlnOrNull()?:"Cappuccino"))

    val coffee:Coffee = Coffee.Latte
    when (coffee){
        Coffee.Americano -> println("Americano")
        Coffee.Latte-> println("Latte")
        Coffee.Cappuccino-> println("Cappuccino")
        Coffee.Espresso-> println("Espresso")
    }

}
