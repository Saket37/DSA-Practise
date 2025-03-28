package sorting

fun main() {
    val arr = mutableListOf(13, 24, 78, 6, 1, 74, 34)
    selectionSort(arr)
    println(arr)
}
// TC - O(n ^2)
private fun selectionSort(arr: MutableList<Int>) {
    for (i in 0..arr.size - 2) {
        var min = i
        for (j in i..<arr.size) {
            if (arr[j] < arr[min]) min = j
        }
        val temp = arr[i]
        arr[i] = arr[min]
        arr[min] = temp
    }
}