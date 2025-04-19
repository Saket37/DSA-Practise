package arrays

import kotlin.math.max

fun main() {
}

// TC - O(n^2)
private fun brute(nums: IntArray) {
    var maxSum = Int.MIN_VALUE
    for (i in 0..nums.lastIndex) {
        var sum = 0
        for (j in i..nums.lastIndex) {
            sum += nums[j]
            maxSum = max(maxSum, sum)
        }
    }
}

private fun kadaneAlgo(nums: IntArray) {

    // if we need to calculate the sub-array "Start" and "End" is the indexes
    var sum = 0
    var max = Int.MIN_VALUE
    var start = 0
    var end = 0
    for (i in 0..nums.lastIndex) {
        if (sum == 0) start = i
        sum += nums[i]

        if (sum > max) {
            max = sum
            end = i
        }
        if (sum < 0) sum = 0
    }
    println(max)
}