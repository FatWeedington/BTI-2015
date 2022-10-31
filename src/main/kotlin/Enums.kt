import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun getCode(m: Month):Int{
    return m.code
}

fun getDays(m: Month):Int{
    return m.days
}

fun getSeason(m: Month):Month.Season{
    return when(m){
        Month.DECEMBER, Month.JANUARY,Month.FEBRUARY  -> Month.Season.WINTER
        Month.MARCH, Month.APRIL,Month.MAY  -> Month.Season.SPRING
        Month.JUNE,Month.JULY,Month.AUGUST  -> Month.Season.SUMMER
        Month.OCTOBER,Month.NOVEMBER,Month.SEPTEMBER  -> Month.Season.FAll
    }
}

fun getMonth(date: LocalDate):Month{
    return Month.values().toList().filter { it.name == date.month.name }[0]
}

fun main() {
    println(getMonth(LocalDate.parse(readln(),DateTimeFormatter.ofPattern("dd.MM.yyyy"))))
}