import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.isActive

fun main() {
 runBlocking{
  val job = launch(Dispatchers.Default) { exec() }
  delay(5000)
  job.cancelAndJoin()
 }


}

suspend fun exec() = coroutineScope {
  while(isActive){
   println("Fönktschn rönnin")
   delay(1000)
  }

  }
