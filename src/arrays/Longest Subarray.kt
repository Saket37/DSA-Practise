package arrays

import kotlin.math.max

fun main() {
    val num =
        //intArrayOf(2, 0, 0, 3)
        intArrayOf(1, 2, 4, 3, 6, 1, 2, 1, 4, 2, 5, 1, 4, 2, 1)
    optimal(num)
}

private fun correctBrute(nums: IntArray, sum: Int = 4) {
    var maxLen = 0
    for (i in nums.indices) {
        var currentSum = 0
        for (j in i..nums.lastIndex) {
            currentSum += nums[j]

            if (currentSum == sum) {
                val currentLen = j - i + 1
                maxLen = max(maxLen, currentLen)
            }
        }
    }
    println("Longest subarray length for sum $sum: $maxLen")
}

// tc - O(n log n) sc - O(n), valid for =Ve, -ve and Zeroes

private fun better(nums: IntArray, sum: Int = 3) {
    val prefixSumMap = mutableMapOf<Int, Int>()
    var currentPrefixSum = 0
    var maxLen = 0

    prefixSumMap[0] = -1
    for (currentIndex in nums.indices) {
        currentPrefixSum += nums[currentIndex]

        val requiredPrefixSum = currentPrefixSum - sum
        if (prefixSumMap.containsKey(requiredPrefixSum)) {
            val previousIndex = prefixSumMap[requiredPrefixSum]!!
            val currentLen = currentIndex - previousIndex
            maxLen = max(maxLen, currentLen)
        }

        if (!prefixSumMap.containsKey(currentPrefixSum)) {
            prefixSumMap[currentPrefixSum] = currentIndex
        }
    }
    println(maxLen)
}

// using 2 pointer, valid for +vs and zeroes
private fun optimal(nums: IntArray, k: Int = 4) {

    var i = 0
    var sum = 0
    var maxLen = 0
    val n = nums.size
    for (j in 0..<n) {
        sum += nums[j]

        while (i <= j && sum > k) {
            sum -= nums[i]
            i++
        }

        if (sum == k) {
            maxLen = max(maxLen, j - i + 1)
        }
    }
    println(maxLen)
}