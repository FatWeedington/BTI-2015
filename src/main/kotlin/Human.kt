import kotlin.math.pow

open class Human(val weight: Int = 75, val height:Double = 1.7 ) {
    open fun run() = "Running like a average Human"
    val BMI = (weight/height * 100.0).pow(2)
}

class Athlete(weight: Int = 60,height:Double = 1.8): Human(weight,height) {
   override fun run() = "Running fast as fuck boooi"
}

fun main() {
    var h1 = Human()
    var h2 = Athlete()

    println(h1.run())
    println(h2.run())
}