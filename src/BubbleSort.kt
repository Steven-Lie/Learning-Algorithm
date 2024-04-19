fun main() {
    val data = listOf(4, 3, 2, 8, 5, 3)
    println(bubbleSort(data))
}

fun bubbleSort(data: List<Int>): List<Int> {
    val sortedData = data.toMutableList()
    for (i in 0..<sortedData.size - 1) {
        for (j in 0..<sortedData.size - 1) {
            if (sortedData[j] > sortedData[j + 1]) {
                sortedData[j] = sortedData[j + 1].also { sortedData[j + 1] = sortedData[j] }
            }
        }
    }
    return sortedData
}