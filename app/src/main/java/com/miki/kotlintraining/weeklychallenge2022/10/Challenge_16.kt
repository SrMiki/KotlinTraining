package com.miki.kotlintraining.weeklychallenge2022.`10`

/*
 * Reto #16 | EN MAYÚSCULA
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 *
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 */

fun main() {


    println(capitalizeText("hola mundo, que tal?"))

}

fun capitalizeText(textToCaps: String): String {

    var string = " $textToCaps"
    var i = string.indexOf(" ") // 1st space
    while (i != -1) {
        string = string.substring(0, i) + string.substring(i, i + 2).uppercase() + string.substring(
            i + 2,
            string.length
        )

        i = string.indexOf(" ", i + 1)
    }
    return string.trim()
}
