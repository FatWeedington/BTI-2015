fun function1(name: String, number: Int = 17, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFunction1() = listOf(
    function1("a"),
    function1("b", number = 1),
    function1("c", toUpperCase = true),
    function1(name = "d", number = 2, toUpperCase = true)
)

fun main() {
    println(useFunction1())  // [a17, b1, C17, D2]
}