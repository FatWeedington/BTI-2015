object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val kotlinLogo: String =
            """| //
              .|//
              .|/ \ """
        print(kotlinLogo.trimMargin("."))

        var city = City()
        city.addBuilding(building1)
        println(city.show())

        val date = "12.12.2022"

        println(date.matches(getPattern()))
    }

}