class Rational(x:Int,y:Int)
{
    val num = x
    val den = y

    def sub(r:Rational) = new Rational((this.num*r.den - r.num*this.den), this.den*r.den)
    def printOut = println(this.num + "/" + this.den)
}

object O2 extends App
{
    val r1 = new Rational(3,4)
    val r2 = new Rational(5,8)
    val r3 = new Rational(2,7)

    val r4 = r1.sub(r2).sub(r3)
    r4.printOut
}