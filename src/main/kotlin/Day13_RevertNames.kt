package main.kotlin

fun main() {
    val names = mutableListOf<String>()
    names.add("Uisaj")
    names.add("Aisak")
    names.add("Aisa")
    names.add("Kemot")
    names.add("Lahcim")

    names.map { it.lowercase().reversed().replaceFirstChar { char -> char.uppercaseChar() } }.forEach { println(it) }
}
