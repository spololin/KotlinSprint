package lesson_3

fun main() {
    val userName = "Татьяна"
    var userSurname = "Андреева"
    val userPatronymic = "Сергеевна"
    var userAge = 20

    println("$userSurname $userName $userPatronymic: $userAge")

    userAge = 22
    userSurname = "Сидорова"

    println("$userSurname $userName $userPatronymic: $userAge")
}