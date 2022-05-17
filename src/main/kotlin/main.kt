fun main() {
    println(findCharacterPercentageInList(listOf("a","b","b")))
}

fun findCharacterPercentageInList(list: List<String>): Double {
    return if (list.isEmpty() || list.any { it.length > 1 || it !in "a".."b" }) {
        -1.0
    } else if (list.any { it in "a" }) {
        "%.2f".format(100 / (list.size / list.count { it in "a" }.toDouble())).toDouble()
    } else {
        -1.0
    }
}

