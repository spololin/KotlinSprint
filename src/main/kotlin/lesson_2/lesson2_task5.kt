package lesson_2

import kotlin.math.*

const val PERCENT_DEPOSIT = 16.7
const val COUNT_ACCRUALS_IN_YEAR = 1

fun main() {
    val deposit = 70_000
    val year = 20
    val finalDeposit = deposit * ((1 + (PERCENT_DEPOSIT / 100) / COUNT_ACCRUALS_IN_YEAR)).pow(COUNT_ACCRUALS_IN_YEAR * year)

    println(String.format("%.3f", finalDeposit))
}

