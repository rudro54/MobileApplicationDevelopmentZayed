package edu.miu.cs.cs425.primaryconswithnotype

class Account(

     balance : Double = 0.0,
     name : String = "",
     accountNumber : String = ""
) {
    init {
        println("in init $balance $name $accountNumber")
    }
    var balance : Double = balance
    var name: String = name
    var accountNumber: String = accountNumber



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