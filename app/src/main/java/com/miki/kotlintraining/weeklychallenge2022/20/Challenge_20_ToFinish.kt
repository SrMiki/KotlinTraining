package com.miki.kotlintraining.weeklychallenge2022.`20`


/*
 * Reto #20 | PARANDO EL TIEMPO
 *
 * Enunciado: Crea una función que sume 2 números y retorne su resultado pasados unos segundos.
 *
 * - Recibirá por parámetros los 2 números a sumar y los segundos que debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma asíncrona, es decir,
 * sin detener la ejecución del programa principal. Se podría ejecutar varias veces al mismo tiempo.
 *
 */

fun main() {

    println(sumWithTime(2, 7, 5))

}

fun sumWithTime(a: Int, b: Int, seconds: Int): Int {
    Thread {
        Thread.sleep((seconds * 1000).toLong())
    }.start()
    return a+b
}
