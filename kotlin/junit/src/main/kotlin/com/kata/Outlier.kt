package com.kata

fun find(integers: Array<Int>): Int {
    val sample = integers.take(3)
    val majorityEven = sample.count { it % 2 == 0 } > 1

    return integers.find { it % 2 == if (majorityEven) 1 else 0 }!!
}