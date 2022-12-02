const val NUMBER_OF_GIFTS = 3

fun main() {
    val gifts = listOf(
        "Perfume", "Socks", "Sweater", "Cup",
        "Hat", "Tea", "Coffee", "Clock", "Bag",
        "Book", "Wallet", "Cream", "Earrings"
    )
    val randomGifts = gifts.asSequence().shuffled().take(NUMBER_OF_GIFTS).toList()
    println(randomGifts)
}
