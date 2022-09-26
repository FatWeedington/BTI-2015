/** Kotlin for Java Developers - HS 22,
 *  Computer Science, Bern University of Applied Sciences */

package strings

import doubleCase
import doubleCaseRec
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DoubleCaseKt {

    @Test
    fun testdoubleCase() {
        Assertions.assertEquals("", doubleCase(""))
        Assertions.assertEquals("Aa", doubleCase("a"))
        Assertions.assertEquals("Aa", doubleCase("A"))
        Assertions.assertEquals("AaBb", doubleCase("aB3"))
        Assertions.assertEquals("", doubleCase("   . . . . "))
        Assertions.assertEquals("AaAaAaAa", doubleCase("%%%A A* A* A*"))
    }

    @Test
    fun testdoubleCaseRec() {
        Assertions.assertEquals("", doubleCaseRec(""))
        Assertions.assertEquals("Aa", doubleCaseRec("a"))
        Assertions.assertEquals("Aa", doubleCaseRec("A"))
        Assertions.assertEquals("AaBb", doubleCaseRec("aB"))
        Assertions.assertEquals("", doubleCaseRec("   . . . . "))
        Assertions.assertEquals("AaAaAaAa", doubleCaseRec("%%%A A* A* A*"))    }
}