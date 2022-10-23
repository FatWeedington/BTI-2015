import kotlin.math.floor
import kotlin.math.pow

const val PI_DECIMAL_POSITION = 5

// Calculates PI until N decimal places stable...

private fun calculatePi() {
    var pi = 0.0
    var previousPI: Double
    var i = 0

    do {
        previousPI = pi
        pi += 4 * (-1.0).pow(i) / (2 * i + 1)
        // println("Step $i: $pi")
        i++
    } while (round(pi, PI_DECIMAL_POSITION) != round(previousPI, PI_DECIMAL_POSITION))
    println("------------------------------")
    println("Steps: $i, at decimal position: $PI_DECIMAL_POSITION")
    println("Calculated PI: ${round(pi, PI_DECIMAL_POSITION)}")
}

private fun round(n: Double, k: Int): Double {
    val c = (10.0).pow(k)
    return floor(n * c) / c
}

fun main() {
    calculatePi()
}