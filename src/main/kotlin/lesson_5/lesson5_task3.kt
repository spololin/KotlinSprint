package org.example.lesson_5

const val CORRECT_NUMBER_1 = 30
const val CORRECT_NUMBER_2 = 40

fun main() {
    val correctNumbers = arrayOf(CORRECT_NUMBER_1, CORRECT_NUMBER_2).sorted()

    println("Please inter two number in range 0 to 42")
    val consoleNumber1 = readln().toInt()
    val consoleNumber2 = readln().toInt()
    val consoleNumbers = arrayOf(consoleNumber1, consoleNumber2).sorted()

    if (correctNumbers.containsAll(consoleNumbers))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (correctNumbers.indexOf(consoleNumbers[0]) != -1 || correctNumbers.indexOf(consoleNumbers[1]) != -1)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}