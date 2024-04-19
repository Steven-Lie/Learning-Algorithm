fun main() {
    val data = listOf(5, 2, 7, 6, 1, 8, 9, 3)
    println(mergeSort(data))
}

fun mergeSort(data: List<Int>): List<Int> {
    if (data.size == 1) {
        return data
    } else {
        val mid = data.size / 2
        val dataA = data.slice(0..<mid)
        val dataB = data.slice(mid..<data.size)
        return merge(mergeSort(dataA), mergeSort(dataB))
    }
}

fun merge(dataA: List<Int>, dataB: List<Int>): List<Int> {
    val size = dataA.size + dataB.size
    val sortedData = MutableList(size) { 0 }
    var sIndex = 0
    var aIndex = 0
    var bIndex = 0

    while ((aIndex < dataA.size) && (bIndex < dataB.size)) {
        if (dataA[aIndex] <= dataB[bIndex]) {
            sortedData[sIndex] = dataA[aIndex]
            aIndex++
        } else {
            sortedData[sIndex] = dataB[bIndex]
            bIndex++
        }
        sIndex++
    }

    while (aIndex < dataA.size) {
        sortedData[sIndex] = dataA[aIndex]
        aIndex++
        sIndex++
    }

    while (bIndex < dataB.size) {
        sortedData[sIndex] = dataB[bIndex]
        bIndex++
        sIndex++
    }
    return sortedData
}