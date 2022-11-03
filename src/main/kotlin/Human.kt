import kotlin.math.pow


enum class BMICategory{UNDERWEIGHT,NORMAL,OVERWEIGHT,OBESITY }

open class Human(val weight: Int = 75, val height:Double = 1.7 ) {
    open fun run() = "Running like a average Human"
    val BMI = weight/height.pow(2)

    open val bmiCategory = when{
        BMI < 18.0 -> BMICategory.UNDERWEIGHT
        BMI < 24.5 -> BMICategory.NORMAL
        BMI < 29.9 -> BMICategory.OVERWEIGHT
        else -> BMICategory.OBESITY
    }
}

class Athlete(weight: Int = 60,height:Double = 1.8): Human(weight,height) {
   override fun run() = "Running fast as fuck boooi"

    override val bmiCategory: BMICategory
        get() = BMICategory.NORMAL
}

fun main() {
    var h1 = Human(100,1.6)
    var h2 = Athlete(100,1.6)

    println(h1.run())
    println(h2.run())
    println(h1.BMI)
    println(h2.BMI)
    println(h1.bmiCategory.name)
    println(h2.bmiCategory.name)
}