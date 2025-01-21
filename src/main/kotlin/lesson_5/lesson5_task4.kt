package org.example.lesson_5

const val REGISTERED_LOGIN = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"

fun main() {
    print("Enter login: ")
    val userLogin = readln().trim()

    if (userLogin == REGISTERED_LOGIN) {
        print("Enter password: ")
        val userPassword = readln().trim()

        if (userPassword == REGISTERED_PASSWORD) {
            println("Welcome!")
        }
    } else {
        println("You must register!")
    }
}