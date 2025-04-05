package leetcode

fun main() {
    val nums = intArrayOf( 0, 1)
    println(missingNumberOp(nums))
}

// brute force
private fun missingNumber(array: IntArray): Int {
    for (i in 0..array.lastIndex) {
        var flag = 0
        for (j in 0..array.lastIndex) {
            if (array[j] == i) {
                flag = 1
                break
            }
        }
        if (flag == 0) return i
    }
    return array.lastIndex + 1
}

// better
private fun missingNumberBetter(array: IntArray): Int {
    val hash = IntArray(array.size + 1) { 0 }
    for (i in 0..array.lastIndex) {
        hash[array[i]] = 1
    }
    for (i in 0..hash.lastIndex) {
        if (hash[i] == 0)
            return i
    }
    return 0
}

//optimal
private fun missingNumberOp(array: IntArray): Int {
    val n = array.size
    val totalSum = (n + 1) * (n) / 2
    var sum = 0
    for (i in 0..array.lastIndex) {
        sum += array[i]
    }
    println(totalSum)
    println(sum)
    return totalSum - sum
}

// 2nd optimal use XOR