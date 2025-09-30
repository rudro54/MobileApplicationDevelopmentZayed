package edu.miu.cs.cs425.singleton

object DataConfig {
    fun getConnection(){
        println("Connecting to DB......")
    }

}

fun main(){
    DataConfig.getConnection();
}