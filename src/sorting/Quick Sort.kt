package sorting

fun main() {
    val arr = mutableListOf(13, 24, 78, 6, 1, 74, 34)
    qs(arr, 0, arr.lastIndex)
    println(arr)
}

// TC - O(n log n)
private fun qs(arr: MutableList<Int>, low: Int, high: Int) {
    if (low < high) {
        val pivot = sort(arr, low, high)
        qs(arr, low, pivot - 1)
        qs(arr, pivot + 1, high)
    }

}

private fun sort(arr: MutableList<Int>, low: Int, high: Int): Int {
    val pivot = arr[low]
    var i = low
    var j = high

    while (i < j) {
        while (arr[i] <= pivot && i <= high - 1) {
            i++
        }
        while (arr[j] > pivot && j >= low + 1) {
            j--
        }
        if (i < j) {
            val temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp
        }
        val temp = arr[low]
        arr[low] = arr[j]
        arr[j] = temp
    }
    return j
}