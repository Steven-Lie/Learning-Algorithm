import kotlin.math.max

fun main() {
    val data = listOf(1, 3, 2, 2, 1, 5)
    println(countingSort(data))
}

fun countingSort(data: List<Int>): List<Int> {
    var maxValue = 0
    for (value in data) {
        maxValue = max(maxValue, value)
    }

    val frequencyTable = MutableList(maxValue + 1) { 0 }
    for (value in data) {
        frequencyTable[value]++
    }

    val sortedData = mutableListOf<Int>()
    for (i in frequencyTable.indices) {
        for (j in 0..<frequencyTable[i]) {
            sortedData.add(i)
        }
    }
    return sortedData
}