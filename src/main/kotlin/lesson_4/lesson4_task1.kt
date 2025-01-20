package org.example.lesson_4

const val COUNT_TABLES = 13

fun main() {
    val tableOccupancyToday = 13
    val tableOccupancyTomorrow = 9

    println("Доступность столиков на сегодня: ${tableOccupancyToday < COUNT_TABLES}\nДоступность столиков на завтра: ${tableOccupancyTomorrow < COUNT_TABLES}")
}