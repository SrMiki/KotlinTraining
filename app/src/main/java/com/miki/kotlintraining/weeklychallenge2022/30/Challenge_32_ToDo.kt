package com.miki.kotlintraining.weeklychallenge2022.`30`

/*
 * Reto #32 | EL SEGUNDO
 *
 * Enunciado: Dado un listado de números, encuentra el SEGUNDO más grande.
 *
 */

fun main() {

    val v1 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val v2 = listOf(4, 6, 1, 8, 2)
    val v3 = arrayListOf(4, 6, 8, 8, 6)
    println("$v1 " + findSecondLarge(v1))
    println("$v2 " + findSecondLarge(v2))
    println("$v3 " + findSecondLarge(v3))


}

fun findSecondLarge(array: List<Int>): Int {

    val result = array.toMutableList()
    result.remove(findTheUpperNumber(result))
    return findTheUpperNumber(result)

}

fun findTheUpperNumber(array: List<Int>): Int {
    var res = array[0]
    for (i in array) {
        if (i > res) {
            res = i
        }
    }
    return res
}