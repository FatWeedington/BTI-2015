import java.time.LocalDate

enum class Canton { BE, JU, ZH }

data class Address(val canton: Canton, val city: String, val street: String, val nbr: String)

data class Citizen(val first: String, val last: String, val adress: Address, val birthday: LocalDate)

fun main(): Unit {
    val list = createCitizen()

    list.sortWith(compareBy({it.first},{it.last}))
    list.forEach { println(it) }
    println()

    list.sortByDescending { it.birthday }
    list.forEach { println(it) }
    println()

    list.sortWith(compareBy({it.adress.canton},{it.adress.city},{it.adress.nbr}))
    list.forEach { println(it) }
    println()

    println(list.minByOrNull { it.birthday })
    println()
    println(list.maxByOrNull { it.birthday })

}

fun createCitizen(): ArrayList<Citizen> {
    val list = ArrayList<Citizen>()

    list.add(
        Citizen(
            "Hans", "Mueller",
            Address(Canton.BE, "Bern", "Hauptstrasse", "14"),
            LocalDate.of(1960, 12, 30)
        )
    )

    list.add(
        Citizen(
            "Helga", "Forster",
            Address(Canton.ZH, "Zurich", "Hauptstrasse", "17"),
            LocalDate.of(1970, 9, 3)
        )
    )

    list.add(
        Citizen(
            "Thomas", "Hirt",
            Address(Canton.JU, "Delemont", "Rue Mouton", "17"),
            LocalDate.of(2005, 11, 29)
        )
    )

    list.add(
        Citizen(
            "Theo", "Hirt",
            Address(Canton.JU, "Delemont", "Rue Mouton", "18"),
            LocalDate.of(2006, 12, 1)
        )
    )

    list.add(
        Citizen(
            "Friedrich", "Gerster",
            Address(Canton.JU, "Delemont", "Rue Principal", "14"),
            LocalDate.of(1950, 12, 30)
        )
    )

    return list
}