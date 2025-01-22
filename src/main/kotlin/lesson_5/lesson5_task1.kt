package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val operand1 = Random.nextInt(1, 100)
    val operand2 = Random.nextInt(1, 100)

    println("How much is $operand1 + $operand2?")
    val resultAddition = readln().toInt()

    println("${if (resultAddition == operand1 + operand2) "Welcome!" else "Access denied!"}")

}