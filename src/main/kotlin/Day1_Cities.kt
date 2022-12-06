package main.kotlin

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val firstCity = Coordinate(1.0, 1.0)
    val secondCity = Coordinate(4.0, 5.0)
    val thirdCity = Coordinate(11.0, 5.0)

    val distance = calculateDistance(firstCity, secondCity) + calculateDistance(secondCity, thirdCity)
    val neededPetrol = distance / 10 * 20
    println(neededPetrol)
}

fun calculateDistance(from: Coordinate, to: Coordinate) = sqrt((to.latitude - from.latitude).pow(2.0) + (to.longitude - from.longitude).pow(2.0))

data class Coordinate(val latitude: Double, val longitude: Double)
