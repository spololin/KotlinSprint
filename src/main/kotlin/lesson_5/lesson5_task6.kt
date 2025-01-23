package org.example.lesson_5

import kotlin.math.pow

fun main() {
    print("Enter your weight (kg): ")
    val userWeight = readln().toDouble()
    print("Enter your height (cm): ")
    val userHeight = readln().toDouble()

    val userWeightInMeters = userHeight / 100
    val bodyMassIndex = userWeight / userWeightInMeters.pow(2)

    print(String.format("ИМТ: %.2f. ", bodyMassIndex))
    when {
        bodyMassIndex < 18.5 -> println("Недостаточная масса тела")
        bodyMassIndex < 25 -> println("Нормальная масса тела")
        bodyMassIndex.toInt() in 25 until 30 -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}