package main.kotlin

fun main() {
    val giftsList = (
        "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, " +
            "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, "
        )

    val result = giftsList.split(", ").filter { it.isNotBlank() }.map { it.split(" ") }.map { mapOf(it.first() to it.drop(1)) }
    println(result)
}
