package org.example.lesson_3

fun main() {
    val stepData = "D2-D4;0"
    val partsStep = stepData.split(";", "-")

    println(partsStep[0])
    println(partsStep[1])
    println(partsStep[2])
}

