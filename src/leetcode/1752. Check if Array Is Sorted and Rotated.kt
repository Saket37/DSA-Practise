package leetcode


fun main() {
    val l = mutableListOf(6, 10, 6)
    //println(rotateList(l))
    println(check(l))

}

// Brute Force Sol
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

/**
 *  reverse(arr, 0, 0)
 *  reverse(arr, 1, arr.lastIndex)
 *  reverse(arr, 0, arr.lastIndex)
 *  the reason of taking this as 0 and 1 rather than using rotation like we do in rotation of array
 *  is that because we are working on a mutable list.
 *  the array will already be rotated by 1, then we perform another rotation by 1. which means we
 *  did rotation +2
 * **/
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

// Brute Force Sol



// optimal
private fun check(arr: MutableList<Int>): Boolean {
    val n = arr.lastIndex
    if (n <= 0) return true

    var inversionCount = 0
    for (i in 1..n) {
        if (arr[i] < arr[i - 1]) {
            inversionCount++
            if (inversionCount > 1) return false
        }
    }
    if (arr[0] < arr[n]) {
        inversionCount++
    }
    return inversionCount <= 1
}