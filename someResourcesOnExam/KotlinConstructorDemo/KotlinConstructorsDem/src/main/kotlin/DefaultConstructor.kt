class DefaultBankAccount(
    var accountNumber: String = "",
    var balance: Double = 0.0
) {
    fun displayBalance() {
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println("------")
    }
}

fun main() {
    val acc1 = DefaultBankAccount()
    val acc2 = DefaultBankAccount("9999")
    val acc3 = DefaultBankAccount("1234", 200.0)

    acc1.displayBalance()
    acc2.displayBalance()
    acc3.displayBalance()
}
