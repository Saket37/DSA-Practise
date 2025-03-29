package sorting

fun main() {
    val arr = mutableListOf(13, 24, 78, 6, 1, 74, 34, 76, 34, 54)
    mergeSort(arr, 0, arr.lastIndex)
    println(arr)
}

// TC - O(n log n)
// SC - O(n)
private fun mergeSort(arr: MutableList<Int>, low: Int, high: Int) {
    if (low >= high) return
    val mid = (low + high) / 2
    mergeSort(arr, low, mid)
    mergeSort(arr, mid + 1, high)
    merge(arr, low, mid, high)
}

private fun merge(arr: MutableList<Int>, low: Int, mid: Int, high: Int) {
    val temp = mutableListOf<Int>()
    var left = low
    var right = mid + 1

    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) {
            temp.add(arr[left])
            left++
        } else {
            temp.add(arr[right])
            right++
        }
    }

    while (left <= mid) {
        temp.add(arr[left])
        left++
    }

    while (right <= high) {
        temp.add(arr[right])
        right++
    }

    for (i in temp.indices) {
        arr[low + i] = temp[i]
    }
}