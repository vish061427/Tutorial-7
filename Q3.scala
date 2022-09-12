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

object O3 extends App{
    
        val acc1 = new Account(1, 1000.0)
        val acc2 = new Account(2, 2000.0)
    
        acc1.transfer(acc2, 500.0)
        println(acc1.balance)  // new balance = 500.0
        println(acc2.balance) // new balance = 2500.0
}