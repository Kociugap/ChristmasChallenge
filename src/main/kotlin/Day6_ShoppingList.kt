package main.kotlin

fun main() {
    val recipes = prepareRecipes()
    val result = recipes.flatMap { it.ingredients.entries }.groupBy { it.key }.mapValues { entry -> entry.value.sumOf { it.value } }.toSortedMap()
    println(result)
}

private fun prepareRecipes(): List<Recipe> {
    return listOf(
        Recipe(
            "Murzynek",
            mapOf(
                "Maka" to 300,
                "Cukier" to 100,
                "Jajka" to 3,
                "Czekolada" to 200,
                "Maslo" to 200
            ),
            "Piekarnik nagrzać do temp. 160 stopni [...]"
        ),
        Recipe(
            "Piernik",
            mapOf(
                "Maka" to 500,
                "Cukier" to 180,
                "Miod" to 250,
                "Jajka" to 1,
                "Mleko" to 80,
                "Maslo" to 150
            ),
            "Piekarnik nagrzać do temp. 180 stopni [...]"
        ),
        Recipe(
            "Sernik",
            mapOf(
                "Maka" to 100,
                "Cukier" to 200,
                "Jajka" to 6,
                "Ser" to 1000,
                "Maslo" to 200
            ),
            "Piekarnik nagrzać do temp. 160 stopni [...]"
        ),
        Recipe(
            "Uszka",
            mapOf(
                "Maka" to 300,
                "Woda" to 100,
                "Jajka" to 1,
                "Sol" to 1,
                "Maslo" to 200,
                "Grzyby" to 150,
                "Cebula" to 1
            ),
            "Zarobić ciasto z mąki, wody, soli i jajka [...]"
        ),
        Recipe(
            "Barszcz",
            mapOf(
                "Buraki" to 1000,
                "Bulion" to 1500,
                "Zakwas" to 200,
                "Sol" to 1
            ),
            "Buraki rozdrobnić i zagotować z bulionem [...]"
        ),
        Recipe(
            "Pierogi",
            mapOf(
                "Maka" to 300,
                "Woda" to 100,
                "Jajka" to 1,
                "Kapusta" to 500,
                "Grzyby" to 50,
                "Cebula" to 1
            ),
            "Zarobić ciasto z mąki, wody, soli i jajka [...]"
        ),
        Recipe(
            "Karp",
            mapOf(
                "Karp" to 1000,
                "Maka" to 50,
                "Mleko" to 500,
                "Sol" to 1,
                "Olej" to 500
            ),
            "Rybę umyć i pokroić w dzwonki [...]"
        )
    )
}

data class Recipe(val name: String, val ingredients: Map<String, Int>, val describe: String)
