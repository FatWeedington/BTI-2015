import java.awt.font.NumericShaper
import java.util.DoubleSummaryStatistics

val intRange = 1..10

    fun main() {
        intRange.forEach { println(it) }
        println(intRange.sum())
        println(intRange.average())
        println(getMedian(intRange))
        println(getMedian((2..17) step(3)))
    }

    fun getMedian(range: IntProgression): Double {
      var intarray = intArrayOf()
        range.forEach { intarray += it }
        return if (intarray.size % 2 == 0) {
            (intarray[intarray.size / 2].toDouble() + intarray[intarray.size / 2 - 1].toDouble()) / 2
        } else {
            (intarray[intarray.size / 2]).toDouble()
        }
    }
