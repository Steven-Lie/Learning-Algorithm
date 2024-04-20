fun main() {
    val data = intArrayOf(2, 5, 7, 4, 6, 1, 3, 8, 9)
    quickSort(data, 0, data.size - 1)
    println(data.contentToString())
}

fun quickSort(data: IntArray, left: Int, right: Int) {
    if (left >= right) return
    val pivot = data[(left + right) / 2]
    var start = left
    var end = right
    while (start <= end) {
        while (data[start] < pivot) start++
        while (data[end] > pivot) end--
        if (start <= end) {
            data[start] = data[end].also { data[end] = data[start] }
            start++
            end--
        }
    }

    quickSort(data, left, end)
    quickSort(data, start, right)
}