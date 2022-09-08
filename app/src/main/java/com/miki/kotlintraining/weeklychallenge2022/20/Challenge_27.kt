package com.miki.kotlintraining.weeklychallenge2022.`20`

/*
 * Reto #27 | VECTORES ORTOGONALES
 *
 * Enunciado: Crea un programa que determine si dos vectores son ortogonales.
 * - Los dos array deben tener la misma longitud.
 * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
 *
 */

fun main() {

    val v1 = listOf(1, 2)
    val v2 = listOf(2, 1)
    val v3 = listOf(-1, 2)

    println(printVectorAreOrthogonal(v1, v1) + areOrthogonal(v1, v1))
    println(printVectorAreOrthogonal(v1, v2) + areOrthogonal(v1, v2))
    println(printVectorAreOrthogonal(v1, v3) + areOrthogonal(v1, v3))
    println(printVectorAreOrthogonal(v2, v3) + areOrthogonal(v2, v3))

}

fun printVectorAreOrthogonal(v1: List<Int>, v2: List<Int>): String {
    return " $v1 y $v2 >> "
}

//producto escalar == 0 >> ortogonal
// a1*b1 + a2*b2
fun areOrthogonal(v1: List<Int>, v2: List<Int>): Boolean {
    return if (v1.size != v2.size || v1.size != 2) {
        false
    } else {
        (v1[0] * v2[0]) + (v1[1] * v2[1]) == 0
    }
}



