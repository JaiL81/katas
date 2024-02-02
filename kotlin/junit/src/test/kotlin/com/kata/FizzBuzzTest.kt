package com.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

internal class FizzBuzzTest {
    @Test
    fun `One Number`() {
        val expected = arrayOf("1")
        assertArrayEquals(expected, fizzBuzzArray(1))
    }

    @Test
    fun `Ten Numbers`() {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        assertArrayEquals(expected, fizzBuzzArray(10))
    }
}