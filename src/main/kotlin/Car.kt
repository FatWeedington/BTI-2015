class Car( val consumption: Double, val tankSize:Int = 30) {
    var gasLevel: Double = 0.0

    fun fillUp(litres:Double){
        if (gasLevel + litres <= tankSize){
            gasLevel += litres
        }
        else {
            println("du huere souhung hesch d tanksteu gsprängt")
            gasLevel = 30.0
        }
    }

    fun drive(km:Double){
        if (gasLevel - consumption/100*km <= 0.0){
            println("du huere soubock, itz hesch ke benz meh")
            gasLevel = 0.0
        }
        else gasLevel -= consumption/100*km
    }

}

fun main() {

}