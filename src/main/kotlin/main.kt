import kotlin.math.roundToInt

fun main() {
    println(findCharacterPercentageInList(listOf("a","a","a","a","a","a","b")))
}

fun findCharacterPercentageInList(list: List<String>): Int {
    return if (list.isEmpty() || list.any { it.length > 1 || it !in "a".."b" }) {
        -1
    } else if (list.any { it in "a" }) {
        (100 / (list.size / list.count { it in "a" }.toDouble())).roundToInt()
    } else {
        -1
    }
}

