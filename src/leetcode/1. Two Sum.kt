package leetcode

fun main() {
    val nums = intArrayOf(3, 2, 3)
    println(optimal(nums).toList())
}

private fun brute(nums: IntArray, target: Int = 6): IntArray {
    for (i in 0..nums.lastIndex) {
        for (j in 0..nums.lastIndex) {
            if (i == j) continue
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

// best approach when we need to return indexes
private fun better(nums: IntArray, target: Int = 9): IntArray {
    val mpp = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val a = nums[i]
        val next = target - a
        if (mpp.containsKey(next)) {
            return intArrayOf(mpp.getValue(next), i)
        } else {
            mpp[a] = i
        }
    }
    return intArrayOf()
}

/**The Two Pointer technique typically works on a sorted array.
It uses two pointers, one starting at the beginning (left) and one at the end (right),
and moves them inwards based on whether the current sum is too small or too large compared to the target.
 **/
private fun optimal(nums: IntArray, target: Int = 6): IntArray {
    var i = 0
    var j = nums.lastIndex
    while (i < j) {
        val sum = nums[i] + nums[j]
        if (sum == target) {
            return intArrayOf(i, j)
        } else if (sum < target) i++
        else j--
    }
    return intArrayOf()
}