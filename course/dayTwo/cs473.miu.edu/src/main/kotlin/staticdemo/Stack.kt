package edu.miu.cs.cs425.staticdemo

import edu.miu.cs.cs425.staticdemo.Stack.Companion.stack

class Stack {


    companion object MyCompanion {
        val stack  = mutableListOf<Int>()
        fun push(Item : Int){
            stack.add(Item)
        }
        fun pop(): Int?{
            return if (stack.isNotEmpty()) null else  stack.removeAt(stack.size - 1)
        }
    }
}

fun main(){
    stack.MyCompanion.push(1)
    stack.MyCompanion.push(2)
}
