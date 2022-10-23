import java.lang.Math.sqrt
import kotlin.random.Random

fun numberGame(){

    val guess = Random.nextInt(1,10)

    for(i in 1..3){
        println("Enter Number:")
        val input = readln().toInt()
        if(input == guess){
            println("Success")
            return
        }
        else if(guess < input){
            println("Lower")
        }
        else {
            println("Higher")
        }
    }
    println("Bad Luck, Game over")

}

fun main() {
    //while(true){numberGame()}
    factoring(readln().toInt()).forEach { print("$it ") }
}

fun factoring(number:Int):IntArray{
    var n = number
    var result:IntArray =  intArrayOf()
    while (n % 2 == 0) {
        result += 2
        n /= 2
    }
    val squareRoot = kotlin.math.sqrt(n.toDouble()).toInt()
    for (i in 3..squareRoot step 2) {
        while (n % i == 0) {
            result += i
            n /= i
        }
    }
    if (n > 2) {
        result += n
    }
    return result
}