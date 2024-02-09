package com.kata

fun mergeAlternately(word1: String, word2: String): String {
    val biggerStringSize = maxOf(word1.length, word2.length)
    val result = StringBuilder()
    for (i in 0 until biggerStringSize) {
        if (i < word1.length) {
            result.append(word1[i])
        }
        if (i < word2.length) {
            result.append(word2[i])
        }
    }
    return result.toString()
}