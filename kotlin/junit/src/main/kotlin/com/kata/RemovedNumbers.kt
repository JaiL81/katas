package com.kata


fun removeNb(n: Long): Array<LongArray> {
    val result = mutableListOf<LongArray>()
    val totalSum = n * (n + 1) / 2

    for (i in 1..n) {
        val j = (totalSum - i) / (i + 1.0)
        if (j <= n && j % 1 == 0.0) {
            result.add(longArrayOf(i, j.toLong()))
        }
    }

    return result.toTypedArray()
}