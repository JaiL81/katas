package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseVowelsTest {

    @Test
    fun `basic tests`() {
        assertEquals("holle", reverseVowels("hello"))
    }
}