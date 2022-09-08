package com.miki.kotlintraining.weeklychallenge2022.`30`

/*
 * Reto #30 | MARCO DE PALABRAS
 *
 * Enunciado: Crea una función que reciba un texto y muestre cada palabra en una línea, formando
 * un marco rectangular de asteriscos.
 *
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 *
 */
fun main() {

    println(textToFrame(" este texto"))
    println(textToFrame("¿que te parece el reto?"))
    println(textToFrame("¿Qué te     parece el reto?"))


}

fun textToFrame(textToFrame: String): String {

    var splitText = textToFrame.trim().split(" ")
    var spaces = getTheLongWord(splitText)
    var res = "\n"
    for (i in splitText) {
        res += "* $i" + addSpaces(i, spaces) + "*\n"
    }
    return addMarks(spaces) + res + addMarks(spaces)

}

fun addMarks(spaces: Int): String {
    var res = "****"
    for (i in 0..spaces) {
        res += "*"
    }
    return res

}

fun addSpaces(word: String, spaces: Int): String {
    var res = " "
    for (i in word.length..spaces) {
        res += " "
    }
    return res
}

fun getTheLongWord(splitText: List<String>): Int {
    var res = 0
    for (i in splitText) {
        if (res < i.length) {
            res = i.length
        }
    }
    return res
}
