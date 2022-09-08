package com.miki.kotlintraining.weeklychallenge2022.`20`

/*
 * Reto #22 | CONJUNTOS
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 */

fun main() {

    println(
        "Common of (1, 2, 3, 4) && (1, 2, 3, 4, 5) >> " + conjunto(
            listOf(1, 2, 3, 4),
            listOf(1, 2, 3, 4, 5),
            true
        )
    )

    println(
        "Common of (1, 2, 3, 4) && (1, 5) >> " + conjunto(
            listOf(1, 2, 3, 4),
            listOf(1, 5),
            true
        )
    )

    println("=======================")

    println(
        "NO Common of (1, 2, 3, 4) && (1, 5) >> " + conjunto(
            listOf(1, 2, 3, 4),
            listOf(1, 5),
            false
        )
    )

    println(
        "NO Common of (1, 2, 3, 4) && (1, 2, 3, 4, 5) >> " + conjunto(
            listOf(1, 2, 3, 3, 4),
            listOf(1, 2, 3, 3, 4, 5),
            false
        )
    )


}

fun conjunto(first: List<Int>, second: List<Int>, common: Boolean): MutableList<Int> {
    val res = mutableListOf<Int>()

    if (common) {
        commonList(first, second, res)
    } else {
        divergeList(first, second, res)
        divergeList(second, first, res)
    }
    return res

}

fun divergeList(first: List<Int>, second: List<Int>, res: MutableList<Int>) {
    for (i in first) {
        if (!res.contains(i) && !second.contains(i)) {
            res.add(i)
        }
    }
}

fun commonList(first: List<Int>, second: List<Int>, res: MutableList<Int>) {
    for (i in first) {
        if (second.contains(i)) {
            res.add(i)
        }
    }
}


