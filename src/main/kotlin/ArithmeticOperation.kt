sealed class ArithmeticOperation {
    abstract fun execute():Int
}

class Add(val sum1:Int,val sum2:Int): ArithmeticOperation() {
    override fun execute():Int = sum1+sum2
}

class Substract(val sum1:Int,val sum2:Int): ArithmeticOperation() {
    override fun execute():Int = sum1-sum2
}


class Multiply(val sum1:Int,val sum2:Int): ArithmeticOperation() {
    override fun execute():Int = sum1*sum2
}

class Incr(val sum1:Int): ArithmeticOperation() {
    override fun execute():Int = sum1+1
}

class Decr(val sum1:Int): ArithmeticOperation() {
    override fun execute():Int = sum1-1
}

class Negate(val sum1:Int): ArithmeticOperation() {
    override fun execute():Int = -sum1
}

fun main() {
    println("Result1 : ${Add(4, 3).execute()}")
    println("Result2 : ${Multiply(4, Incr(3).execute()).execute()}")
}