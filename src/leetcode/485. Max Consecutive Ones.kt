package leetcode

fun main() {
    val nums = intArrayOf(0, 0)
    println(findMaxConsecutiveOnes(nums))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {

    var max = 0
    var currentCount = 0
    for (i in 0..nums.lastIndex) {
        if (i == nums.lastIndex) {
            if (nums[i] == 1) currentCount++
            else currentCount = 0
        } else {
            if (nums[i] == 1) {
                currentCount++
                println(currentCount)
            } else {
                currentCount = 0
            }

        }
        max = maxOf(max, currentCount)

    }

    return max
}