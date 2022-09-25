/** Kotlin for Java Developers - HS 22,
 *  Computer Science, Bern University of Applied Sciences */

package strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DoubleCaseTestKt {

    fun doubleCase(s:String):String{
        val letters :String = s.filter {it.isLetter()}
        var result = "";
        for(l in letters){
            result = result.plus(l.uppercase())
            result = result.plus(l.lowercase())
        }
        return result
    }

    @Test
    fun testdoubleCase() {
        Assertions.assertEquals("", doubleCase(""))
        Assertions.assertEquals("Aa", doubleCase("a"))
        Assertions.assertEquals("Aa", doubleCase("A"))
        Assertions.assertEquals("AaBb", doubleCase("aB3"))
        Assertions.assertEquals("", doubleCase("   . . . . "))
        Assertions.assertEquals("AaAaAaAa", doubleCase("%%%A A* A* A*"))
    }
}