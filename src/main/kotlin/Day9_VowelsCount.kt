package main.kotlin

fun main() {
    val vowels = setOf('a', 'e', 'i', 'o', 'y', 'u')
    val remaining = prepareAddresses().joinToString("") { it.street.lowercase() }.count { char -> char in vowels }
    println(remaining * 2)
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
            "289A",
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
            "Cukierkowa",
            "23I",
            5,
            "Poznan",
            "02-326"
        )
    )
    return addresses
}
