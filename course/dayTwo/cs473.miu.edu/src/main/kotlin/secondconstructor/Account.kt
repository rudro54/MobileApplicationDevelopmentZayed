package edu.miu.cs.cs425.secondconstructor

class Account(

    var balance : Double,
    var name : String,
    var accountNumber : String
) {

    constructor(accountNumber:String):this(balance = 0.0,name="Unknow",accountNumber=accountNumber)
    //constructor(accountNumber: String, name: String):this(balance = 0.0,name=name,accountNumber=accountNumber)
    constructor(accountNumber: String,name: String):this(accountNumber=accountNumber)


    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountNumber='$accountNumber')"
    }


}

fun main(){
//    val account = Account()
//    account.balance = 100.0
//    account.name = "John"
//    account.accountNumber = "123456789"
//    println(account)
}