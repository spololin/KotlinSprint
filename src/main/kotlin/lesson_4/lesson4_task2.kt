package org.example.lesson_4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100

fun main() {
    var weightAverage = 20
    var volumeAverage = 80
    var isCorrespondsAverage =
        (weightAverage > AVERAGE_MIN_WEIGHT && weightAverage <= AVERAGE_MAX_WEIGHT)
                && (volumeAverage < AVERAGE_MAX_VOLUME);

    println("Груз с весом $weightAverage кг и объемом $volumeAverage л соответствует категории 'Average': " +
            "$isCorrespondsAverage")

    weightAverage = 50
    volumeAverage = 100

    isCorrespondsAverage =
        (weightAverage > AVERAGE_MIN_WEIGHT && weightAverage <= AVERAGE_MAX_WEIGHT)
                && (volumeAverage < AVERAGE_MAX_VOLUME)

    println("Груз с весом $weightAverage кг и объемом $volumeAverage л соответствует категории 'Average': " +
            "$isCorrespondsAverage")
}