package com.example.android.architecture.blueprints.todoapp

import org.junit.Assert.*
import org.junit.Test
import kotlin.math.exp

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(5, 10 - 5)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(6, 2 * 3)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(4, 16 / 4)
    }

    @Test
    fun subtraction_inCorrect() {
        assertNotEquals(7, 2 - 8)
    }

    @Test
    fun addition_inCorrect() {
        assertNotEquals(8, 5 + 2)
    }

    @Test
    fun division_inCorrect() {
        assertNotEquals(3, 7 / 4)
    }
}
