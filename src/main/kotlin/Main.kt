import java.util.*

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
    }
}