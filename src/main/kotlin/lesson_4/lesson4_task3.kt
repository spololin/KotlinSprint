package org.example.lesson_4

fun main() {
    val sunnyWeather = true
    val openAwning = true
    val airHumidity = 20
    val seasonYear = "winter"

    val favorableConditions = sunnyWeather && openAwning && airHumidity == 20 && seasonYear != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}