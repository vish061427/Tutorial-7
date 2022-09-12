class Rational(x:Int,y:Int)
{
    val num = x
    val den = y

    def neg = new Rational(-this.num,this.den)
    def printOut = println(this.num + "/" + this.den)
}

object Main extends App
{
    val x = new Rational(5,8)
    x.neg.printOut
}