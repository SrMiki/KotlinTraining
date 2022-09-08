package com.miki.kotlintraining.weeklychallenge2022.`00`

/*
 * Reto #2 | LA SUCESIÓN DE FIBONACCI
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre
 * es la suma de los dos anteriores
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

fun main() {
    fibonacci(50)
}

private fun fibonacci(i: Int) {
    var n1: Long = 0
    var n2: Long = 1
    for (i in 2..50) {
        val aux = n2
        n2 = n1 + n2
        n1 = aux
        println("$i) $n2")
    }
}
