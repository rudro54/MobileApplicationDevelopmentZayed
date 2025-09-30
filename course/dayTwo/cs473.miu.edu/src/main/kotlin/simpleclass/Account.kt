package edu.miu.cs.cs425.simpleclass

class Account {

    var balance : Double = 0.0
    var name : String = ""
    var accountNumber : String = ""

    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountNumber='$accountNumber')"
    }


}

fun main(){
    val account = Account()
    account.balance = 100.0
    account.name = "John"
    account.accountNumber = "123456789"
    println(account)
}