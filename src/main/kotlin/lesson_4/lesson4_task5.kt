package org.example.lesson_4

const val LAUNCH_CONDITION_WITH_DAMAGE = false
const val LAUNCH_CONDITION_WITH_MIN_COUNT_CREW = 55
const val LAUNCH_CONDITION_WITH_MAX_COUNT_CREW = 70
const val LAUNCH_CONDITION_WITH_MIN_COUNT_BOXES_PROVISION = 50
const val LAUNCH_CONDITION_WITH_FAVORABLE_WEATHER = true

fun main() {
    val shipDamage = false
    val shipCountCrew = 55
    val shipCountBoxesProvision = 51
    val shipFavorableWeather = true

    val shipCanRun =
        shipDamage == LAUNCH_CONDITION_WITH_DAMAGE &&
                shipCountCrew in LAUNCH_CONDITION_WITH_MIN_COUNT_CREW..LAUNCH_CONDITION_WITH_MAX_COUNT_CREW &&
                shipCountBoxesProvision > LAUNCH_CONDITION_WITH_MIN_COUNT_BOXES_PROVISION &&
                shipFavorableWeather == LAUNCH_CONDITION_WITH_FAVORABLE_WEATHER

    val shipCanRunAlternative =
        shipCountCrew == LAUNCH_CONDITION_WITH_MAX_COUNT_CREW &&
                shipCountBoxesProvision >= LAUNCH_CONDITION_WITH_MIN_COUNT_BOXES_PROVISION &&
                shipFavorableWeather == LAUNCH_CONDITION_WITH_FAVORABLE_WEATHER

    println("Корабль ${if (shipCanRun || shipCanRunAlternative) "может" else "не может"} отправиться в плавание")
}