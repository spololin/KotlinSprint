package org.example.lesson_4

fun main() {
    val dayExercises = 5
    val isEven = dayExercises % 2 == 0

    println(
        """
        Упражнения для рук: ${!isEven}
        Упражнения для ног: $isEven
        Упражнения для спины: $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )
}