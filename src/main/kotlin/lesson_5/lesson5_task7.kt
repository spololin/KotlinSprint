package org.example.lesson_5

fun main() {
    print("Enter distance (km): ")
    val travelDistance = readln().toFloat()
    print("Enter fuel consumption (l): ")
    val fuelConsumption = readln().toFloat()
    print("Enter cost per liter (rub): ")
    val costPerLiter = readln().toFloat()

    val totalFuel = (travelDistance * fuelConsumption) / 100
    val totalCostFuel = totalFuel * costPerLiter

    println(String.format("Всего топлива: %.2f, стоимость поездки: %.2f", totalFuel, totalCostFuel))
}