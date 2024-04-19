fun main() {
    val data = listOf(1, 4, 3, 4, 5, 2, 5, 6)
    println(sequentialSearch(5, data))
    println(sequentialSearch(8, data))
}

fun sequentialSearch(x: Int, data: List<Int>): Int? {
    for ((i, value) in data.withIndex()) {
        if (value == x) {
            return i
        }
    }
    return null
}