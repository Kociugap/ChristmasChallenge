package main.kotlin

fun main() {
    val addresses = prepareAddresses().distinct()
    println(addresses)
}

private fun prepareAddresses(): List<Address> {
    val addresses = mutableListOf<Address>()
    addresses.add(
        Address(
            "Serniczkowa",
            "4B",
            2,
            "Krakow",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Pierniczkowa",
            "289",
            55,
            "Gdansk",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Pierniczkowa",
            "289",
            55,
            "Gdansk",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Pierniczkowa",
            "289",
            55,
            "Gdansk",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Barszczykowa",
            "234",
            5,
            "Rzeszow",
            "37-326"
        )
    )
    addresses.add(
        Address(
            "Uszkowa",
            "43H",
            5,
            "Wroclaw",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Uszkowa",
            "43H",
            5,
            "Wroclaw",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Uszkowa",
            "43H",
            5,
            "Wroclaw",
            "02-326"
        )
    )
    addresses.add(
        Address(
            "Cukierkowa",
            "23",
            5,
            "Poznan",
            "02-326"
        )
    )
    return addresses
}

data class Address(val street: String, val numberOfHouse: String, val amount: Int, val city: String, val postcode: String) {
    override fun toString() = "[$street, $numberOfHouse, $amount, $city, $postcode]"
}
