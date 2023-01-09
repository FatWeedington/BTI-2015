import java.time.LocalDate
import Tense.*

@Suppress("EnumEntryName")
enum class Tense {
    ago, from_now
}

infix fun Int.days(timing:Tense): LocalDate =
    when(timing){
        ago -> LocalDate.now().minusDays(this.toLong())
        from_now -> LocalDate.now().plusDays(this.toLong())
    }


fun main() {
    val date1 = 2 days ago
    println(date1)
    println(3 days from_now)
}
