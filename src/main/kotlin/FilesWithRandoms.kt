import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.io.File
import java.io.PrintWriter
import kotlin.random.Random

suspend fun printLines(fileName : String) {
    val list = mutableListOf<Int>()
    for (i in 0..99) {
        val rand = Random.nextInt(0, 99)
        list += rand
    }
    withContext(Dispatchers.IO) {
        PrintWriter(fileName).use { writer ->
            list.forEach { writer.println(it) }
            writer.print(list.sum())
        }
    }
    println("$fileName created in ${Thread.currentThread()}")
}

fun main() {
    runBlocking {
        for(i in 1..100){
            launch(Dispatchers.IO) {
                printLines("data${File.separator}file$i.txt")
            }
        }
    }
}