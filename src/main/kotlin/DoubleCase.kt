fun doubleCase(s:String):String{
    val letters :String = s.filter {it.isLetter()}
    var result = "";
    for(l in letters){
        result = result.plus(l.uppercase())
        result = result.plus(l.lowercase())
    }
    return result
}

fun doubleCaseRec(s:String):String{
    val letters :String = s.filter {it.isLetter()}
    if (letters.isNotEmpty()){
    return letters.first().uppercase().plus(letters.first().lowercase()).plus(doubleCaseRec(letters.drop(1)))
    }
    else return ""
}