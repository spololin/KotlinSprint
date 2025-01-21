package org.example.lesson_5

const val RIDDLE_NUMBER_1 = 30
const val RIDDLE_NUMBER_2 = 40

fun main() {
    val riddleNumbers = arrayOf(RIDDLE_NUMBER_1, RIDDLE_NUMBER_2).sorted()

    println("Please inter two number in range 0 to 42")
    val consoleNumber1 = readln().toInt()
    val consoleNumber2 = readln().toInt()
    val consoleNumbers = arrayOf(consoleNumber1, consoleNumber2).sorted()

    if (riddleNumbers.containsAll(consoleNumbers))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (riddleNumbers.indexOf(consoleNumbers[0]) != -1 || riddleNumbers.indexOf(consoleNumbers[1]) != -1)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}