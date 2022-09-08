package com.miki.kotlintraining.weeklychallenge2022.`10`

/*
 * Reto #13 | FACTORIAL RECURSIVO
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un
 * número dado de forma recursiva.
 *
 */

fun main() {

    println("5 >> " + reverseFactorial(5))
    println("1 >> " + reverseFactorial(1))
    println("0 >> " + reverseFactorial(0))
    println("8 >> " + reverseFactorial(8))
    println("-5 >> " + reverseFactorial(-5))

}

fun reverseFactorial(n: Int): Int {
    if (n < 0) {
        return -1 //error!
    }

    return if (n < 2) {
        1
    } else {
        n * reverseFactorial(n - 1)
    }

}