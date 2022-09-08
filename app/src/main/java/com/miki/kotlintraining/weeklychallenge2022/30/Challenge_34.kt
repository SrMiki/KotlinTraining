package com.miki.kotlintraining.weeklychallenge2022.`30`


/*
 * Reto #34 | LOS NÚMEROS PERDIDOS
 *
 * Enunciado: Dado un array de enteros ordenado y sin repetidos, crea una función que calcule
 * y retorne todos los que faltan entre el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 *
 *
 */

fun main() {

    val v1 = listOf(1, 5, 7)
    val v2 = arrayListOf(1, 3, 5)
    val v3 = arrayListOf(5, 1)
    val v4 = arrayListOf(-5, 1)
    val v5 = arrayListOf(10, 7, 7, 1)
    val v6 = arrayListOf(10)

    println(" $v1 " + fillArray(v1))
    println(" $v2 " + fillArray(v2))
    println(" $v3 " + fillArray(v3))
    println(" $v4 " + fillArray(v4))
    println(" $v5 " + fillArray(v5))
    println(" $v6 " + fillArray(v6))

}

fun fillArray(array: List<Int>): List<Int> {
    val lower = getLower(array)
    val higher = getHigher(array)

    if (lower == null || higher == null || checkDuplicates(array)) {
        return emptyList()
    }


    val res = mutableListOf<Int>()

    for (i in 0..(higher-lower)) {
        res.add(lower + i)
    }
    return res

}

fun checkDuplicates(array: List<Int>): Boolean {
    for (i in array.indices) {
        if (array.lastIndexOf(array[i]) != i) {
            return true
        }
    }
    return false
}

fun getLower(array: List<Int>): Int? {
    val res = array.first()
    for (element in array) {
        if (res > element) {
            return null
        }
    }
    return res

}

fun getHigher(array: List<Int>): Int? {
    val res = array.last()
    for (element in array) {
        if (res < element) {
            return null
        }
    }
    return res
}
