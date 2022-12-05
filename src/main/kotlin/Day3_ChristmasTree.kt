package main.kotlin

const val HEIGHT = 10
private var builder = StringBuilder()

fun main() {
    (0 until HEIGHT).forEach { buildRow(it) }.also { print(builder) }
}

private fun buildRow(row: Int) {
    buildSpaces(row)
    buildStars(row)
    builder.append(System.lineSeparator())
}

private fun buildSpaces(row: Int) {
    val spaces = HEIGHT - (row + 1)
    (0 until spaces).forEach { _ -> builder.append(" ") }
}

private fun buildStars(row: Int) {
    val stars = row * 2 + 1
    (0 until stars).forEach { _ -> builder.append("*") }
}
