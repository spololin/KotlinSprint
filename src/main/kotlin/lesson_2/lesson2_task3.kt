package lesson_2

const val COUNT_MINUTES_SECONDS = 60

fun main() {
    val hourStart: Int = 9
    val minuteStart: Int = 39
    var minutesRun: Int = 457

    val hourOnWay: Int = minutesRun / COUNT_MINUTES_SECONDS
    val minutesOnWay = minutesRun - hourOnWay * COUNT_MINUTES_SECONDS

    var hourArrival: Int = hourStart + hourOnWay
    var minuteArrival: Int = minuteStart + minutesOnWay

    if (minuteArrival >= COUNT_MINUTES_SECONDS) {
        hourArrival += minuteArrival / COUNT_MINUTES_SECONDS
        minuteArrival %= COUNT_MINUTES_SECONDS
    }

    println(String.format("%02d:%02d", hourArrival, minuteArrival))
}

