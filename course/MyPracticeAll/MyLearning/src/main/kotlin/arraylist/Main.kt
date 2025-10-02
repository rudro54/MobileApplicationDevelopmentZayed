package cs473.edu.miu.arraylist

fun main() {
    // create a mutable list
    val names = arrayListOf("Zayed", "Zafirah", "Zyva")
    println(names)
    names.clear() // empty the list
    //println(names.first())
    println(names.firstOrNull())
    println(names.lastOrNull())


}