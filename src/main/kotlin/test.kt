fun main() {
    try {
        badFunction()
        println("A")
    } catch (e:Exception) {
        println("C")
    } catch (e:RuntimeException) {
        println("B")
    } finally {
        println("D")
    }
    println("E")
}
private fun badFunction() {
    throw RuntimeException()
}