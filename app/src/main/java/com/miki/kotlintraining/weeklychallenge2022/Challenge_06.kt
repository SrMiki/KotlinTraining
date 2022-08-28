package com.miki.kotlintraining.weeklychallenge2022

/*
 * Reto #6 | INVIRTIENDO CADENAS
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones
 * propias del lenguaje que lo hagan de forma automática.
 *
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 */

fun main() {

    println(reverseString(""))
    println(reverseString("h"))
    println(reverseString("holamundo"))
    println(reverseString("odnum aloH"))
    println(reverseString("frase normal"))
    println(reverseString("reconocer"))

}

fun reverseString(stringToReverse: String): String {
    if (stringToReverse.length < 2) {
        return stringToReverse
    }
    var aux = ""
    
    for (i in (stringToReverse.length - 1) downTo 0) {
        aux += stringToReverse[i]
    }
    return aux

}
