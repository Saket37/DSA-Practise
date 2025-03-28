package sorting

fun main() {
    val arr = mutableListOf(13, 24, 78, 6, 1, 74, 34)
    insertionSort(arr)
    println(arr)
}
// TC = O(n^2)
// Best case - O(n)
private fun insertionSort(arr: MutableList<Int>) {
    for (i in 0..<arr.size) {
        var j = i
        while (j > 0 && arr[j - 1] > arr[j]) {
            val temp = arr[j - 1]
            arr[j - 1] = arr[j]
            arr[j] = temp
            j--
        }
    }
}