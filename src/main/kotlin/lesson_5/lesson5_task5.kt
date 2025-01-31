package org.example.lesson_5

fun main() {
    val riddleNumber1 = (0..42).random()
    val riddleNumber2 = (0..42).random()
    val correctNumber3 = (0..42).random()
    val riddleNumbers = listOf(riddleNumber1, riddleNumber2, correctNumber3)

    println("Please inter two number in range 0 to 42")
    val consoleNumber1 = readln().toInt()
    val consoleNumber2 = readln().toInt()
    val consoleNumber3 = readln().toInt()
    val consoleNumbers = listOf(consoleNumber1, consoleNumber2, consoleNumber3)

    val intersectValuesCount = riddleNumbers.intersect(consoleNumbers.toSet()).size

    print("Угадано чисел: $intersectValuesCount. ")
    when (intersectValuesCount) {
        3 -> println("Вы выиграли джекпот!")
        2 -> println("Вы выиграли крупный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Вы не угадал ни одного числа!")
    }

    println("Загаданные числа: ${consoleNumbers.joinToString()}")
}