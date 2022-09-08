package com.miki.kotlintraining.weeklychallenge2022.`20`

/*
 * Reto #25 | PIEDRA, PAPEL, TIJERA
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 *
 */
fun main() {
    println(playRSP(arrayListOf("RS", "SR", "PS")))

    println(playRSP(arrayListOf("SS", "RS", "SR")))

    println(playRSP(arrayListOf("PR", "PS", "SP")))

}

fun playRSP(games: ArrayList<String>): String {

    var player1Points = 0
    var player2Points = 0


    for (i in games) {
        val res = game(i)
        if (res == 1) {
            player1Points++
        } else {
            player2Points++
        }
    }
    val finalPoints = (player1Points - player2Points).toInt()
    return if (finalPoints > 0) {
        "Player 1"
    } else if (finalPoints < 0) {
        "Player 2"
    } else {
        "Tie"
    }
}

fun game(i: String): Int {
    return when (i) {
        "RS", "SP", "PR" -> 1
        "SR", "PS", "RP" -> 2
        else -> 0
    }
}

