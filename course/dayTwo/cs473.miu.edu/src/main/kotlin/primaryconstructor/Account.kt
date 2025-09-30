package edu.miu.cs.cs425.primaryconstructor

class Account(

    private var balance : Double,
    private var name : String,
    val accountNumber : String
) {

    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountNumber='$accountNumber')"
    }


}

fun main(){
    val account = Account(100.0,"Zayed","123456789")
//    account.balance = 100.0
//    account.name = "John"
//    account.accountNumber = "123456789"
    println(account)
}