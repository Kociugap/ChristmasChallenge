fun main() {
    val gifts: List<Gift> = prepareGifts()

    val small = Envelope(10, 15)
    val medium = Envelope(20, 30)
    val big = Envelope(30, 30)

    gifts.forEach {
        it.takeIf { checkIfSuitMe(it, small) }?.let { gift -> println("$gift suits to small $small.") }
        it.takeIf { checkIfSuitMe(it, medium) }?.let { gift -> println("$gift suits to medium $medium.") }
        it.takeIf { checkIfSuitMe(it, big) }?.let { gift -> println("$gift suits to big $big.") }
    }

}

private fun checkIfSuitMe(gift: Gift, envelope: Envelope): Boolean {
    return (gift.height <= envelope.height && gift.width <= envelope.width) || (gift.height <= envelope.width && gift.width <= envelope.height)
}

private fun prepareGifts(): List<Gift> {
    return listOf(
        Gift("Parfum", 12, 30),
        Gift("Socks", 10, 10),
        Gift("Book", 30, 25),
        Gift("Clock", 15, 15),
        Gift("Wallet", 5, 10)
    )
}

data class Gift(val name: String, val width: Int, val height: Int)
data class Envelope(val width: Int, val height: Int)
