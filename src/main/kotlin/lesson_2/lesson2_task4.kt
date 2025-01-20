package lesson_2

const val BUFF = 20
//const val TOTAL_PERCENTS = 100

fun main() {
    val cristalOre = 7
    val ironOre = 11

    println("CristalOre: ${cristalOre * (BUFF.toFloat() / TOTAL_PERCENTS)}")
    println("ironOre: ${ironOre * (BUFF.toFloat() / TOTAL_PERCENTS)}")
}

