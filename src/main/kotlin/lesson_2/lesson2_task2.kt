package lesson_2

const val EMPLOYEE_SALARY = 30000
const val INTERN_SALARY = 20000

fun main() {
    val countEmployee = 50
    val countIntern = 30

    val employeesSalary = countEmployee * EMPLOYEE_SALARY
    val internsSalary = countIntern * INTERN_SALARY
    val totalSalaries = employeesSalary + internsSalary
    val averageSalaryEmployee = totalSalaries / (countEmployee + countIntern)

    println(employeesSalary)
    println(internsSalary)
    println(totalSalaries)
    println(averageSalaryEmployee)
}
