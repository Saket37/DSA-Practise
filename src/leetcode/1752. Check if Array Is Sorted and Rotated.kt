package leetcode


fun main() {
    val l = mutableListOf(6, 10, 6)
    println(rotateList(l))
}

private fun isSorted(arr: MutableList<Int>): Boolean {

    if (arr.size <= 1) {
        return true
    }

    for (i in 1..arr.lastIndex) {
        if (arr[i] < arr[i - 1]) {
            return false
        }
    }

    return true
}

private fun rotateList(arr: MutableList<Int>): Boolean {
    var rotation = 1
    while (rotation <= arr.lastIndex) {
        reverse(arr, 0, 0)
        reverse(arr, 1, arr.lastIndex)
        reverse(arr, 0, arr.lastIndex)
       // println(arr)

        if (!isSorted(arr)) {
            rotation++
        } else {
            return true
        }
    }
    return false
}

private fun reverse(arr: MutableList<Int>, start: Int, end: Int) {
    if (start > end) return
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
   // println("REV ${arr}")
    reverse(arr, start + 1, end - 1)
}