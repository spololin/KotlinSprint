package lesson_1

const val COUNT_SECONDS_MINUTES = 60

fun main() {
    val duration: Short = 6485
    val hours: Int = duration / (COUNT_SECONDS_MINUTES * COUNT_SECONDS_MINUTES)
    val countSecondsInMinutes: Int = duration - hours * COUNT_SECONDS_MINUTES * COUNT_SECONDS_MINUTES
    val minutes: Int = countSecondsInMinutes / COUNT_SECONDS_MINUTES
    val seconds: Int = countSecondsInMinutes - minutes * COUNT_SECONDS_MINUTES

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}

