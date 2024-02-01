package com.kata

val romanNumeralsMap: HashMap<String, Int> = hashMapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
)

fun romanNumeralsDecoder(str: String): Int {
    var result = 0
    var last = 0
    for (i in str.length - 1 downTo 0) {
        val current = romanNumeralsMap[str[i].toString()] ?: 0
        if (current < last) {
            result -= current
        } else {
            result += current
        }
        last = current
    }
    return result
}