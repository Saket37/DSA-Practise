package leetcode

import kotlin.math.max
import kotlin.math.min

fun main() {
    val nums = intArrayOf(7, 6, 4, 3, 1)
    brute(nums)
}

// fails on some test cases
private fun brute(nums: IntArray) {
    var min = 0
    for (i in 0..nums.lastIndex) {
        if (nums[min] > nums[i])
            min = i
    }
    var max = 0
    for (i in min..nums.lastIndex) {
        if (nums[min] < nums[i]) {
            max = max(max, nums[i])
        }
    }

}

private fun max(prices: IntArray): Int {
    var min = prices[0]
    var maxProfit = 0
    for (i in 0..prices.lastIndex) {
        val cost = prices[i] - min
        maxProfit = max(maxProfit, cost)
        min = min(min, prices[i])
    }
    return maxProfit
}
