package org.example.lesson_5

const val RIDDLE_NUMBER_1 = 30
const val RIDDLE_NUMBER_2 = 40

fun main() {
    println("Please inter two number in range 0 to 42")
    val consoleNumber1 = readln().toInt()
    val consoleNumber2 = readln().toInt()

    if ((consoleNumber1 == RIDDLE_NUMBER_1 && consoleNumber2 == RIDDLE_NUMBER_2) ||
        (consoleNumber1 == RIDDLE_NUMBER_2 && consoleNumber2 == RIDDLE_NUMBER_1)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((consoleNumber1 == RIDDLE_NUMBER_1 || consoleNumber1 == RIDDLE_NUMBER_2) ||
        (consoleNumber2 == RIDDLE_NUMBER_1 || consoleNumber2 == RIDDLE_NUMBER_2)
    )
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}