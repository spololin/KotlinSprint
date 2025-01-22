package org.example.lesson_5

import java.util.*

const val AGE_MAJORITY = 18

fun main() {
    val userYearBirthday = readln().toInt()
    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    if (currentYear - userYearBirthday >= AGE_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Скрыть экран со скрытым контентом")
    }
}