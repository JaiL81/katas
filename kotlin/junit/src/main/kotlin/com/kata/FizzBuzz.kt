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