data class Building(val residents: Int = 0) {
    fun moveIn(moreResidents: Int):Building {
        return Building(residents + moreResidents)
    }
    }

fun main() {
    var oldHouse = Building()
    println(oldHouse)
    oldHouse = oldHouse.copy(residents = 5)
    println(oldHouse)
}