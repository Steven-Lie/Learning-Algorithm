fun main() {
    // note: data should be sorted
    val data = listOf(1, 1, 3, 5, 5, 6, 7)
    println(binarySearch(3, data))
}

fun binarySearch(x: Int, data: List<Int>): Int? {
    var left = 0
    var right = data.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        if (data[mid] < x) {
            left = mid + 1
        } else if (data[mid] > x) {
            right = mid - 1
        } else {
            return mid
        }
    }
    return null
}