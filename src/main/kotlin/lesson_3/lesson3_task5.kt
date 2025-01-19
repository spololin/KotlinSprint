package org.example.lesson_3

fun main() {
    val stepData = "D2-D4;0"
    val partsStepData = stepData.split(";")
    val steps = partsStepData[0].split("-")

    val stepStart = steps[0]
    val stepEnd = steps[1]
    val stepNumber = partsStepData[1]

    println(stepStart)
    println(stepEnd)
    println(stepNumber)
}

