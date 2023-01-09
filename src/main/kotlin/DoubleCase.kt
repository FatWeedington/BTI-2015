fun doubleCase(s:String):String{
    val letters :String = s.filter {it.isLetter()}
    var result = "";
    for(l in letters){
        result += (l.uppercase())
        result += (l.lowercase())
    }
    return result
}

fun doubleCaseRec(s:String):String{
    val letters :String = s.filter {it.isLetter()}
    return if (letters.isNotBlank()){
        letters.first().uppercase()
            .plus(letters.first().lowercase())
            .plus(doubleCaseRec(letters.drop(1)))
    }
    else ""
}

fun main() {
    println(doubleCase(readln()))
    println(doubleCaseRec(readln()))
}