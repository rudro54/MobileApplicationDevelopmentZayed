package cs473.edu.miu
class Account(
    accountNo: String = "",
    balance: Double = 0.0
) {
    // property initialization using constructor parameters
    val accountNo: String = maskAccountNo(accountNo)
    var balance: Double = balance

    // initializer block
    init {
        println("✅ Account created successfully!")
        println("Initial Account No: $accountNo, Initial Balance: $balance")
        println("------")
    }

    // function to mask account number (for security)
    fun maskAccountNo(accountNo: String): String {
        // hide all digits except last 2
        return if (accountNo.length > 2)
            "*".repeat(accountNo.length - 2) + accountNo.takeLast(2)
        else
            accountNo
    }

    // display function
    fun display() {
        println("Account No: $accountNo, Balance: $balance")
    }
}

fun main() {
    // create account with parameters
    val account = Account(accountNo = "123456789", balance = 100.0)

    // modify balance
    account.balance += 100.0

    // display updated info
    account.display()
}
