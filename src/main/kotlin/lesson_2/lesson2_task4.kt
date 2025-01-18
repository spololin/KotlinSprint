package lesson_2

const val BUFF = 20

fun main() {
    val cristalOre = 7
    val ironOre = 11

    println("CristalOre: ${cristalOre * (BUFF.toFloat() / 100)}")
    println("ironOre: ${ironOre * (BUFF.toFloat() / 100)}")
}

