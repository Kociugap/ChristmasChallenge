package main.kotlin

fun main() {
    val preparedChildren = prepareChildren()
    preparedChildren.forEach { println(it) }
}

private fun prepareChildren(): List<ChildWithAddress> {
    return listOf(
        ChildWithAddress(
            "Jasiu",
            "Kowalski",
            Address(
                "Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
            )
        ),
        ChildWithAddress(
            "Kasia",
            "Nowak",
            Address(
                "Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
            )
        ),
        ChildWithAddress(
            "Asia",
            "Wisniewska",
            Address(
                "Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
            )
        ),
        ChildWithAddress(
            "Tomek",
            "Wojcik",
            Address(
                "Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
            )
        )
    )
}

data class ChildWithAddress(val name: String, val surname: String, val address: Address) {
    override fun toString() = """
        $name $surname
        ${address.street} ${address.numberOfHouse}
        ${address.city} ${address.postcode}
        --------------------
    """.trimIndent()
}
