package com.miki.kotlintraining.weeklychallenge2022.`20`

/*
 * Reto #24 | ITERATION MASTER
 *
 * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
 * ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.
 *
 */
fun main() {

    countTo100()
}

fun countTo100() {

    //1st
    println("for")
    for (i in 0..100) {
        print("$i ")
    }

    print("\n\n------------------\n\n")

    //2nd
    println("while")
    var j = 0
    while (j <= 100) {
        print("$j ")
        j++
    }

    print("\n\n------------------\n\n")

    //3rd
    println("forEach")
    (1..100).forEach { index ->
        print("$index ")
    }

}
