fun main() {
    val data = listOf(4, 3, 2, 8, 5, 3)
    println(selectionSort(data))
}

fun selectionSort(data: List<Int>): List<Int> {
    val sortedData = data.toMutableList()
    for (i in sortedData.indices) {
        var minIndex = i
        for (j in i + 1..<sortedData.size) {
            if (sortedData[j] < sortedData[minIndex]) {
                minIndex = j
            }
        }
        sortedData[i] = sortedData[minIndex].also { sortedData[minIndex] = sortedData[i] }
    }
    return sortedData
}