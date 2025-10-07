package cs473.edu.miu

class ZayedBankAccount(
    var accountNumber: String,
    var balance: Double
) {
    // Secondary constructor #1
    constructor(accountNumber: String) : this(accountNumber, 0.0) {
        println("Secondary constructor called")
    }

    // Secondary constructor #2
    constructor() : this("0000") {
        println("Default constructor called")
    }

    // Secondary constructor #3
    constructor(balance: Double) : this("0000") {
        this.balance = balance
    }

    override fun toString() = "$accountNumber, $balance"
}


fun main() {
    val acc1 = ZayedBankAccount("1234", 200.0)  // Primary constructor
    val acc2 = ZayedBankAccount("5678")          // Secondary #1
    val acc3 = ZayedBankAccount()                // Secondary #2
    val acc4 = ZayedBankAccount(300.0)           // Secondary #3

    println(acc1)
    println(acc2)
    println(acc3)
    println(acc4)
}

