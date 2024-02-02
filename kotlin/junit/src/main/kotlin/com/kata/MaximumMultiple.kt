package com.kata

fun maxMultiple(d: Int, b: Int): Int = (b downTo d).find { it % d == 0 }!!