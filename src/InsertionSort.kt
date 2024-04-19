fun main() {
    val data = listOf(4, 3, 2, 8, 5, 3)
    println(insertionSort(data))
}

fun insertionSort(data: List<Int>): List<Int> {
    val sortedData = data.toMutableList()
    for (i in sortedData.indices) {
        var pos = i
        while (pos > 0 && sortedData[pos] < sortedData[pos - 1]) {
            sortedData[pos] = sortedData[pos - 1].also { sortedData[pos - 1] = sortedData[pos] }
            pos--
        }
    }
    return sortedData
}