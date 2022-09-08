package com.miki.kotlintraining.weeklychallenge2022.`10`

import java.text.Normalizer


/*
 * Reto #12 | ¿ES UN PALÍNDROMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean)
 * según sean o no palíndromos. Un Palíndromo es una palabra o expresión que es igual si
 * se lee de izquierda a derecha que de derecha a izquierda.
 *
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 *
 * Ejemplo:
 *  Ana lleva al oso la avellana
 *  reconocer
 *
 */

fun main() {


    println("Reconocer -> " + isPalindrome("reconocer"))
    println("Dábale arroz a la zorra el abad -> " + isPalindrome("Dábale arroz a la zorra el abad"))
    println("Ana lleva al oso, la avellana -> " + isPalindrome("Ana lleva al oso, la avellana"))
    //println(isPalindrome("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida"))


}

fun isPalindrome(string: String): Boolean {

    val normalizedText = Normalizer.normalize(string.lowercase(), Normalizer.Form.NFD)
        .replace("[^\\p{ASCII}]".toRegex(), "")
        .replace("[^a-z0-9]".toRegex(), "")
    return normalizedText == normalizedText.reversed()


    /* problem with áéíóú, etc. !! >> normalize
    for (i in 0..(modString.length - 1) / 2) {
        if ( modString[i] != modString[modString.length - 1 - i]) {
            return false
        }
    }
    return true
     */
}
