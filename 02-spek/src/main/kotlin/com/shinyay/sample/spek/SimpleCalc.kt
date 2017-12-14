package com.shinyay.sample.spek

import java.util.*

fun add(x: Int, y: Int): Int = x + y

fun main(args: Array<String>) {
    val random = Random()
    val x = random.nextInt()
    val y = random.nextInt()

    println("$x + $y = ${add(x, y)}")
}