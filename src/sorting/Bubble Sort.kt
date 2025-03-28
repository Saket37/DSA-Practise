package sorting

fun main() {
    val arr = mutableListOf(13, 24, 78, 6, 1, 74, 34)
    bubbleSort(arr)
    println(arr)
}

// TC - O(n^2)
// Best case - O(n)
private fun bubbleSort(arr: MutableList<Int>) {
    for (i in arr.size - 1 downTo 1) {
        var didSwap = 0
        for (j in 0 until i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
                didSwap = 1
            }
        }
        if (didSwap == 0) break
    }
}