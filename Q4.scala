class Account(accId:Int,bal: Double = 0.0){

    val accountID = accId
    var balance = bal

    def withdraw(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(acc:Account, amount:Double) : Unit = {
        if (this.balance < 0.0) println("Insufficient balance")
        else {
            this.withdraw(amount)
            acc.deposit(amount)
        }
    }
}

var bank:List[Account] = List()

def checkNegativeBalance() : Unit = {
    for (acc <- bank) {
        if (acc.balance < 0.0) println("Account ID: " + acc.accountID + " has a negative balance")
    }
}

def sumOfAllBalances() : Double = {
    var sum:Double = 0.0
    for (acc <- bank) {
        sum = sum + acc.balance
    }
    return sum
}

def finalBalance() : Unit = {
    var interest:Double = 0.05
    var overdraft:Double = 0.1

    for (acc <- bank) {
        if (acc.balance < 0.0) {
            acc.balance = acc.balance + (acc.balance * overdraft)
            println("Account ID: " + acc.accountID + " has a negative balance of " + acc.balance+" .Overdraft fee applied")
        }
        else {
        acc.balance = acc.balance + (acc.balance * interest)
        println("Account ID: " + acc.accountID + " has a positive balance of " + acc.balance)
        }
    }
}

object O4 extends App
{
    var acc1 = new Account(1, 1000.0)
    var acc2 = new Account(2, 2500.0)
    var acc3 = new Account(3, 4600.0)
    var acc4 = new Account(4, 9430.0)
    var acc5 = new Account(5, 8000.0)
    var acc6 = new Account(6, -1000.0)
    var acc7 = new Account(7, -2000.0)
    var acc8 = new Account(8, -3000.0)
    var acc9 = new Account(9, -4000.0)
    var acc10 = new Account(10, -1000.0)

    bank = List(acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10)

    checkNegativeBalance()
    println("Sum of all balances: " + sumOfAllBalances())
    println("Final balance of all accounts")
    finalBalance()
}