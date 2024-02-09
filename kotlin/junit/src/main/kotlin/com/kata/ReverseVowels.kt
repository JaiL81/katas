package com.kata

fun reverseVowels(s: String): String {
    var forwardsIndex = 0
    var backwardsIndex = s.length - 1
    val result = StringBuilder(s)

    while (forwardsIndex < backwardsIndex) {
        val forwardCharIsVowel = s[forwardsIndex].isVowel()
        val backwardCharIsVowel = s[backwardsIndex].isVowel()

        when {
            forwardCharIsVowel && backwardCharIsVowel -> {
                result[forwardsIndex] = s[backwardsIndex]
                result[backwardsIndex] = s[forwardsIndex]
                forwardsIndex++
                backwardsIndex--
            }
            !forwardCharIsVowel -> forwardsIndex++
            !backwardCharIsVowel -> backwardsIndex--
        }
    }

    return result.toString()
}

fun Char.isVowel(): Boolean = this.lowercaseChar() in "aeiou"