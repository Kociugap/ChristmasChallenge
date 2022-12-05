import java.nio.charset.Charset

fun main() {
    val gifts = listOf(
        "Perfume", "Socks", "Sweater", "Cup",
        "Hat", "Tea", "Coffee", "Clock", "Bag",
        "Book", "Wallet", "Cream", "Earrings"
    )
    gifts.map { gift ->
        print("$gift ")
        gift.toByteArray(Charset.defaultCharset()).map { byte -> print("${Integer.toBinaryString(byte.toInt())} ") }
        println()
    }
}
