import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val kotlinLogo: String =
            """| //
              .|//
              .|/ \ """
        println(kotlinLogo.trimMargin("."))

        var city = City()
        city.addBuilding(building1)
        city.show()
    }
}