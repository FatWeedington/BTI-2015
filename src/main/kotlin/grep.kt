import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File

fun grep(fileString:String,searchString:String){
    val file = File(fileString)
    file.forEachLine {
        if( it.contains(searchString)){
            println("${file.path} $it ${Thread.currentThread()}")
        }
    }
}



fun main() {
    val input = readln()
    val folder = "data${File.separator}"

    runBlocking {
        launch(Dispatchers.Default){grep(folder+"file1.txt",input)}
        launch(Dispatchers.Default){grep(folder+"file2.txt",input)}
        launch(Dispatchers.Default){grep(folder+"file3.txt",input)}
    }
}