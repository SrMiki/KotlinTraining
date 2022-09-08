package com.miki.kotlintraining.weeklychallenge2022.`00`

/*
 * Reto #8 | DECIMAL A BINARIO
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario
 * sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 */
fun main() {

    println("1 -> " + toBinary(1))
    println("2 -> " + toBinary(2))
    println("3 -> " + toBinary(3))
    println("7 -> " + toBinary(7))
    println("8 -> " + toBinary(8))
    println("16 -> " + toBinary(16))
    println("19 -> " + toBinary(19))
    println("35 -> " + toBinary(35))
    println("111 -> " + toBinary(111))
    println("512 -> " + toBinary(512))
    println("756 -> " + toBinary(756))

}

private fun toBinary(numberToConvert: Int): String {
    if(numberToConvert <=0){
        return "0"
    }
    var res = "1"
    var i = numberToConvert

    while (i > 1) {
        res += i % 2
        i /= 2
    }

    return res


}