package com.miki.kotlintraining.weeklychallenge2022.`10`

import kotlin.math.pow


/*
 * Reto #14 | ¿ES UN NÚMERO DE ARMSTRONG?
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong
 * (o también llamado narcisista).
 *
 */

fun main() {

//    for (i in 100..1000 ){
//        if (isAmstrongNumber(i)){
//            println(i)
//        }
//    }

    println("2  >> " + isAmstrongNumber(2))
    println("  >> " + isAmstrongNumber(2))
    println("153 >> " + isAmstrongNumber(153))
    println("357 >> " + isAmstrongNumber(357))
    println("371 >> " + isAmstrongNumber(371))
    println("407 >> " + isAmstrongNumber(407))
    println("4150  >> " + isAmstrongNumber(4150))


}

fun isAmstrongNumber(n: Int): Boolean {

    return if (n < 0) {
        false
    } else {
        var result = 0
        val size = n.toString().length

        n.toString().forEach { character ->
            result += character.toString().toDouble().pow(size).toInt()
        }

        n == result
    }
}


