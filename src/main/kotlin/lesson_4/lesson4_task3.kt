package org.example.lesson_4

const val IS_SUNNY_WEATHER_CRITERIA = true
const val IS_OPEN_AWNING_CRITERIA = true
const val AIR_HUMIDITY_CRITERIA = 20
const val SEASON_YEAR_CRITERIA = "winter"

fun main() {
    val isSunnyWeather = true
    val isOpenAwning = true
    val airHumidity = 20
    val seasonYear = "winter"

    val isFavorableConditions = isSunnyWeather == IS_SUNNY_WEATHER_CRITERIA
            && isOpenAwning == IS_OPEN_AWNING_CRITERIA
            && AIR_HUMIDITY_CRITERIA == airHumidity
            && seasonYear != SEASON_YEAR_CRITERIA

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}