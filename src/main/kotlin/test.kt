import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferreds: List<Deferred<Int>> = (1..5).map {
        async(Dispatchers.Default) {
            delay(5000-it*1000L)
            println("Loading $it")
            it
        }
    }
    val sum = deferreds.awaitAll().sum()
            println("$sum")
}


class Brunz(val n1:String,val n2:String) : ArithmeticOperation(){
    override fun execute(): Int {
        return "$n1$n2".length
    }

}