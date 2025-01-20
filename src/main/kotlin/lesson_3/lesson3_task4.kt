package lesson_3

fun main() {
    var startPosition = "E2"
    var endPosition = "E4"
    var step = 1

    println("$startPosition-$endPosition;${step++}")

    startPosition = "D2"
    endPosition = "D3"

    println("$startPosition-$endPosition;$step")
}