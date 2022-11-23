data class Person(val pid:Int, val name:String)

fun main() {
    val p1 = Person(1,"Qrt")
    val p2 = Person(2,"Qsi")
    val p3 = Person(3,"Andi")
    val p4 = Person(4,"Kevin")
    val p5 = Person(5,"Rolf")

    var list  = arrayListOf(p1,p2,p3,p4,p5)

    list.forEach {println(it)}

    list.replaceAll{it.copy(name = "**${it.name}**")}

    //list.replaceAll{Person(it.pid,"***${it.name}***")}

    list.forEach { println(it)}

    list.removeIf {it.pid % 2 == 1 }

    list.forEach { println(it)}

}