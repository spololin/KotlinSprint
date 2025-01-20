package org.example.lesson_4

const val RUN_SHIP_DAMAGE = false
const val RUN_SHIP_MIN_COUNT_CREW = 55
const val RUN_SHIP_MAX_COUNT_CREW = 70
const val RUN_SHIP_MIN_COUNT_BOXES_PROVISION = 50
const val RUN_SHIP_FAVORABLE_WEATHER = true

fun main() {
    val shipDamage = false
    val shipCountCrew = 55
    val shipCountBoxesProvision = 51
    val shipFavorableWeather = true

    val shipCanRun =
        shipDamage == RUN_SHIP_DAMAGE
                && shipCountCrew in RUN_SHIP_MIN_COUNT_CREW..RUN_SHIP_MAX_COUNT_CREW
                && shipCountBoxesProvision > RUN_SHIP_MIN_COUNT_BOXES_PROVISION
                && shipFavorableWeather == RUN_SHIP_FAVORABLE_WEATHER

    val shipCanRunAlternative =
        shipCountCrew == RUN_SHIP_MAX_COUNT_CREW
                && shipCountBoxesProvision >= RUN_SHIP_MIN_COUNT_BOXES_PROVISION
                && shipFavorableWeather == RUN_SHIP_FAVORABLE_WEATHER

    println("Корабль ${if (shipCanRun || shipCanRunAlternative) "может" else "не может"} отправиться в плавание")
}