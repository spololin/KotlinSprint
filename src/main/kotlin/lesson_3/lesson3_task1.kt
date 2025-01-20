package lesson_3

fun main() {
    val userName: String = "Сергей"
    val greetingDay: String = "Добрый день"
    val greetingEvening: String = "Доброй вечер"
    var greetingForUser: String = "$greetingDay, $userName!"
    println(greetingForUser)

    greetingForUser = "$greetingEvening, $userName!"
    println(greetingForUser)
}