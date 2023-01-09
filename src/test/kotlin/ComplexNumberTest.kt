package strings

import ComplexNumber
import minus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import plus
import times

internal class ComplexNumberTest {

    @Test
    fun plus() {
        val c1 = ComplexNumber(5.5, 4.0)
        val c2 = ComplexNumber(1.2, 3.5)
        assertEquals(ComplexNumber(6.7, 7.5), c1 + c2)
        assertEquals(c1 + c2, c2 + c1)
        var c3 = ComplexNumber(2.4, 7.2)
        assertEquals(c1 + c2 + c3, c3 + c2 + c1)
        c3 += c1
        assertEquals(c1 + ComplexNumber(2.4, 7.2), c3)
    }

    @Test
    fun plusDouble() {
        val c1 = ComplexNumber(5.5, 4.0)
        assertEquals(ComplexNumber(9.5, c1.img), c1 + 4.0)
        assertEquals(ComplexNumber(9.5, c1.img), 4.0 + c1)
        assertEquals(c1 + 3.0, 3.0 + c1)
    }

    @Test
    fun minus() {
        val c1 = ComplexNumber(5.5, 4.0)
        val c2 = ComplexNumber(1.2, 3.5)
        assertEquals(ComplexNumber(4.3, 0.5), c1 - c2)
        var c3 = ComplexNumber(2.4, 7.2)
        c3 -= c1
        assertEquals(ComplexNumber(2.4, 7.2) - c1, c3)
    }

    @Test
    fun minusDouble() {
        val c1 = ComplexNumber(5.5, 4.0)
        assertEquals(ComplexNumber(1.5, c1.img), c1 - 4.0)
        assertEquals(ComplexNumber(-1.5, c1.img * -1.0), 4.0 - c1)
    }

    @Test
    fun times() {
        val m1 = ComplexNumber(5.0, -2.0)
        val m2 = ComplexNumber(3.0, 4.0)
        assertEquals(ComplexNumber(23.0, 14.0), m1 * m2)
        assertEquals(m1 * m2, m2 * m1)
        var m3 = ComplexNumber(5.5, 4.0)
        assertEquals(m1 * m2 * m3, m3 * m2 * m1)
        m3 *= m1
        assertEquals(m1 * ComplexNumber(5.5, 4.0), m3)
    }

    @Test
    fun timesDouble() {
        val c1 = ComplexNumber(5.5, 4.0)
        assertEquals(ComplexNumber(22.0, 16.0), c1 * 4.0)
        assertEquals(ComplexNumber(22.0, 16.0), 4.0 * c1)
        assertEquals(c1 * 3.0, 3.0 * c1)
    }
}