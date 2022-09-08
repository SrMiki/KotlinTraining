package com.miki.kotlintraining.weeklychallenge2022.`10`

/*
 * Reto #10 | EXPRESIONES EQUILIBRADAS
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión
 * están equilibrados.
 *
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 */

fun main() {

    println(checkMathExp("{ [ a * ( c + d ) ] - 5 }"))      //true
    println(checkMathExp("a * ( c + d ) ] - 5 "))           //false
    println(checkMathExp("{a + b [c] * (2x2)}}}}"))         //false
    println(checkMathExp("{ [ a * ( c + d ) ] - 5 }"))      //true
    println(checkMathExp("{ a * ( c + d ) ] - 5 }"))        //false
    println(checkMathExp("{a^4 + (((ax4)}"))                //false
    println(checkMathExp("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"))
    println(checkMathExp("{{{{{{(}}}}}}"))
    println(checkMathExp("(a"))
    println(checkMathExp("(a)"))
    println(checkMathExp("{ b + (a) }"))


}

fun checkMathExp(mathexp: String): Boolean {

    val del = "{[()]}"
    val aux = ArrayList<String>()

    for (i in mathexp) {
        if (del.contains(i)) {
            aux.add(i.toString())
        }
    }

    return checkAllDels(aux)
}

fun checkAllDels(del: ArrayList<String>): Boolean {
    if (del.size < 2 || del.size % 2 != 0) {
        return false
    }
    for (i in 0..(del.size - 1) / 2) {

        if (!checkDel(del[i], del[del.size - 1 - i])) {
            return false
        }
    }
    return true
}

fun checkDel(openDel: String, closedDel: String): Boolean {
    return if (openDel == "{" && closedDel == "}") {
        true
    } else if (openDel == "[" && closedDel == "]") {
        true
    } else openDel == "(" && closedDel == ")"
}