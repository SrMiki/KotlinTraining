package com.miki.kotlintraining.weeklychallenge2022

/*
 * Reto #3 | ¿ES UN NÚMERO PRIMO?
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

fun main() {

    for (i in 1..100) {
        if (isPrime(i)) {
            println("$i) ") //+ isAPrimeNumber(i))
        }
    }
}

private fun isPrime(n: Int): Boolean {
    if (n < 1 ||(n != 2 && n % 2 == 0)) {
        return false
    }
    for (i in 3..(n / 2) step 2) { //3, 5, 7...N / 2
        if (n % i == 0) {
            return false
        }
    }
    return true
}
