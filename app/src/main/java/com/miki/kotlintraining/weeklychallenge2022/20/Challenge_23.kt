package com.miki.kotlintraining.weeklychallenge2022.`20`

/*
 * Reto #23 | MÁXIMO COMÚN DIVISOR Y MÍNIMO COMÚN MÚLTIPLO
 *
 * Enunciado: Crea dos funciones, una que calcule el máximo común divisor (MCD)
 *  y otra que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 *
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 */
fun main() {

    println("MCD(10,12) >> " + maxCommonDivisor(10, 12))
    println("mcm(10,12) >> " + minimumCommonMultiple(10, 12))

}

fun minimumCommonMultiple(a: Int, b: Int): Int {
    return (a * b) / maxCommonDivisor(a, b)
}

fun maxCommonDivisor(a: Int, b: Int): Int {
    var higher = a
    var lower = b
    if (b > a) {
        higher = b
        lower = a
    }

    while (higher % lower > 1) {
        val aux = lower
        lower = higher - (lower * (higher / lower))
        higher = aux
    }
    return lower
}
