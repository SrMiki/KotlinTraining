package com.miki.kotlintraining.weeklychallenge2022.`30`

/*
 * Reto #31 | AÑOS BISIESTOS
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 *
 */

fun main() {

    printThirtyLeapYears(2020)

}

private fun printThirtyLeapYears(year: Int) {

    var currentYear = year + 1
    var yearCount = 0

    while (yearCount < 30) {
        if (currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0)) {
            println(currentYear)
            yearCount++
        }
        currentYear++
    }
}
