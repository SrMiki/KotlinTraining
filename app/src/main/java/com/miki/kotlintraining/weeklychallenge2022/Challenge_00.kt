package com.miki.kotlintraining.weeklychallenge2022

/*
* Reto #0
* "FIZZ BUZZ"
*
* Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100
* (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
* - Múltiplos de 3 por la palabra "fizz".
* - Múltiplos de 5 por la palabra "buzz".
* - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
*
*
*/

fun main() {
    for (i in 1..100) {
        val divBythree = i % 3 == 0;
        val divByFive = i % 5 == 0;
        if (divBythree && divByFive) {
            println("fizzbuzz")
        } else if (divBythree) {
            println("fizz")
        } else if (divByFive) {
            println("buzz")
        } else {
            println(i)
        }
    }
}