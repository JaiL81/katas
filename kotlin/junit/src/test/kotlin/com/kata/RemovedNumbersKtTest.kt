package com.kata

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RemovedNumbersKtTest {
    fun testing(n: Long, expect: String) {
        val actual = removeNb(n)
        assertEquals(expect, actual.contentDeepToString())
    }
    @Test
    fun basicTests() {
        testing(26, "[[15, 21], [21, 15]]")
        testing(101,  "[[55, 91], [91, 55]]")
        testing(102,  "[[70, 73], [73, 70]]")
        testing(100, "[]")

    }
}