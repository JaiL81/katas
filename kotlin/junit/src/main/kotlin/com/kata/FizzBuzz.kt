package com.kata


fun main() {
    for (i in 1..100) {
        fizzBuzzIfElse(i)
    }

    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

private fun fizzBuzzIfElse(i: Int) {
    if (i % 3 == 0 && i % 5 == 0) {
        println("FizzBuzz")
    } else if (i % 3 == 0) {
        println("Fizz")
    } else if (i % 5 == 0) {
        println("Buzz")
    } else {
        println(i)
    }
}

fun fizzBuzz(i: Int): String {
    return when {
        i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> i.toString()
    }
}

fun fizzBuzzArray(n: Int): Array<String> {
    val result = Array(n) { "" }
    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result[i - 1] = "FizzBuzz"
            i % 3 == 0 -> result[i - 1] = "Fizz"
            i % 5 == 0 -> result[i - 1] = "Buzz"
            else -> result[i - 1] = i.toString()
        }
    }
    return result
}