package com.miki.kotlintraining.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean)
 * según sean o no anagramas.
 *
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 */

fun main() {

    println(isAnagrama("ola", "lado")) //false
    println(isAnagrama("rata", "tara")) // true
    println(isAnagrama("costa", "tacos")) //true
    println(isAnagrama("olor", "color")) //false
    println(isAnagrama("amor", "amor")) //false (equals!)
    println(isAnagrama("roma", "amor")) //true


}

private fun isAnagrama(s1: String, s2: String): Boolean {

    if (s1.length != s2.length || s1.lowercase().equals(s2.lowercase())) {
        return false;
    }

    for (a in s1.lowercase()) {
        if (!s2.lowercase().contains(a)) {
            return false;
        }
    }
    return true;
}

private fun isAnagramaV2(wordOne: String, wordTwo: String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray()
        .contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}