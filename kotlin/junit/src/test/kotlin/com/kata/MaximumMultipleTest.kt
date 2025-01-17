package com.kata

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MaximumMultipleTest {
    @Test
    fun basicTests() {
        assertEquals(6, maxMultiple(2, 7))
        assertEquals(9, maxMultiple(3, 10))
        assertEquals(14, maxMultiple(7, 17))
        assertEquals(50, maxMultiple(10, 50))
        assertEquals(185, maxMultiple(37, 200))
        assertEquals(98, maxMultiple(7, 100))
    }
}