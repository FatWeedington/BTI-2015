import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun getCode(m: Month):Int{
    return m.code
}

fun getDays(m: Month):Int{
    return m.days
}

fun getSeason(m: Month):Month.Season{
    return m.season
}

fun getMonth(date: LocalDate):Month{
    return Month.values().toList().filter { it.name == date.month.name }[0]
}

fun main() {
    println(getMonth(LocalDate.parse(readln(),DateTimeFormatter.ofPattern("dd.MM.yyyy"))))
}