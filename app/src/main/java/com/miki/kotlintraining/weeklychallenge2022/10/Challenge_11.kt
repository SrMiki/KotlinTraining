package com.miki.kotlintraining.weeklychallenge2022.`10`

/*
 * Reto #11 | ELIMINANDO CARACTERES
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 *
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 */
fun main() {

    removeChar("hola", "mola")
    removeChar("la mar", "marzo")
    removeChar("Me gusta Java", "Me gusta Kotlin")

}

fun removeChar(s1: String, s2: String) {

    println("$s1||$s2")
    println(printDistChar(s1, s2) + "||" + printDistChar(s2, s1))

}


fun printDistChar(s1: String, s2: String): String {
    var resultString = ""
    for (i in s1.lowercase()) {
        if (!s2.lowercase().contains(i)) {
            resultString += i
        }
    }
    return resultString

}