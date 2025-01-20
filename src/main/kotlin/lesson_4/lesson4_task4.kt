package org.example.lesson_4

fun main() {
    val armExercises = 1
    val legExercises = 0
    val backExercises = 0
    val absExercises = 1
    val dayExercises = 5

    println("""
        Упражнения для рук: ${dayExercises % 2 == armExercises}
        Упражнения для ног: ${dayExercises % 2 == legExercises}
        Упражнения для спины: ${dayExercises % 2 == backExercises}
        Упражнения для пресса: ${dayExercises % 2 == absExercises}
    """.trimIndent())
}