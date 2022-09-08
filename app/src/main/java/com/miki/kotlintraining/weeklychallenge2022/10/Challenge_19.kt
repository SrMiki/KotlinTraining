package com.miki.kotlintraining.weeklychallenge2022.`10`

/*
 * Reto #19 | CONVERSOR TIEMPO
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 *
 */

fun main() {


    println(dateToMiliSeconds(10, 10, 10, 10))
    println(dateToMiliSeconds(10, 0, 0, 0))
    println(dateToMiliSeconds(0, 0, 0, 10))
    println(dateToMiliSeconds(2, 5, -45, 10))
    println(dateToMiliSeconds(2000000000, 5, 45, 10))

}

fun dateToMiliSeconds(days: Int, hour: Int, minutes: Int, seconds: Int): Long {
    return (((((days * 24 + hour) * 60 + minutes) * 60) + seconds) * 1000).toLong()

}
