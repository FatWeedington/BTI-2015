import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val kotlinLogo: String =
            """| //
              .|//
              .|/ \ """
        println(kotlinLogo.trimMargin("."))
    }
}