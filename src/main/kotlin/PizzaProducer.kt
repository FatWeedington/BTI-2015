import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import java.util.concurrent.atomic.AtomicInteger

val pizzaChannel = Channel<PizzaOrder>()

data class PizzaOrder(
    val orderNumber: String,
    val waiter: String = "Default"
)

class PizzaProducer(val waiter : String){
    companion object{
        private var id = AtomicInteger(1)
    }
    suspend fun producePizzaOrders() = coroutineScope{
        repeat(100) {
            isActive
            pizzaChannel.send(PizzaOrder("${id.getAndIncrement()}",waiter))
            delay(100)
        }
        pizzaChannel.close()
    }
}

class PizzaOrderConsumer{
    companion object {
        private var id = 1
    }

    val name = "consumer ${id++}"

    suspend fun consume(channel : Channel<PizzaOrder>) = coroutineScope{
        channel.consumeEach {
            isActive
            println("$it consumed by $name") }
    }
}

fun main() {
    runBlocking {
        val producer = PizzaProducer("Hans")
        val producer2 = PizzaProducer("Peter")
        val job = launch{
            yield()
            launch(Dispatchers.Default){producer.producePizzaOrders()}
            launch(Dispatchers.Default){producer2.producePizzaOrders()}
            launch(Dispatchers.Default){PizzaOrderConsumer().consume(pizzaChannel)}
            launch(Dispatchers.Default){PizzaOrderConsumer().consume(pizzaChannel)}
            launch(Dispatchers.Default){PizzaOrderConsumer().consume(pizzaChannel)}
        }
        delay(5000)
        job.cancel()
        println("pess Q to cancle")
        if(readln() == "Q")
        job.start()
    }
}