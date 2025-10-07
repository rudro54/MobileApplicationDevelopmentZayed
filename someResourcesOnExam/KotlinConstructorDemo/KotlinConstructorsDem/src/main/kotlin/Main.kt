package cs473.edu.miu

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BankAccount(
    var accountNumber: String,
    var balance: Double
){
    constructor(accountNumber:String):this(accountNumber, 0.0){
        println("Secondary constructor with account number called" )
    }
    constructor():this("0000"){
        println("default consturctor called")
    }
    override fun toString():String {
        return "BankAccount(accountNumber='$accountNumber', balance=$balance)"
    }
}



fun main() {
    val acc1 = BankAccount("12345", 200.0)
    val acc2 = BankAccount("9999")
    val acc3 = BankAccount()

    println(acc1)
    println(acc2)
    println(acc3)



}