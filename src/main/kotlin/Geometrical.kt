import kotlin.math.pow

interface Geometrical {
    val isPolygon : Boolean
        get() = false

    val  area:Double

    fun perimeter():Double
}

class Circle(val radius: Double):Geometrical{

   override val area = radius.pow(2.0)*Math.PI

    override fun perimeter():Double {
        return 2.0*Math.PI*radius
    }

}

class Square(val side:Double):Geometrical{

    override val area =  side.pow(2.0)

    override fun perimeter():Double {
        return side*4.0
    }

    override val isPolygon: Boolean
        get() = true
}

fun main() {
    val c1 = Circle(1.0);
    val c2 = Circle(2.0);
    val c3 = Circle(Math.PI);
    val s1 = Square(1.0);
    val s2 = Square(Math.E);
    val s3 = Square(2.0);

    val arr = arrayOf(c1,c2,c3,s1,s2,s3)

    arr.forEach { println("area:${it.area} | perimeter: ${it.perimeter()} | isPolygon: ${it.isPolygon}") }
}