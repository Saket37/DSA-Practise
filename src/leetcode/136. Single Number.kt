package leetcode

fun main() {
    val nums = intArrayOf(-1)
    println(singleNumber(nums))
}
// brute force, pick and element make a count. if anyone remains 1 that is the number

// better approach - TC - O(n) and SC - O(n)
fun singleNumber(nums: IntArray): Int {
    var max = Int.MAX_VALUE
    for (i in 0..nums.lastIndex) {
        if (nums[i] > max) {
            max = nums[i]
        }
    }
    val map = mutableMapOf<Int, Int>().withDefault { 0 }
    for (i in 0..nums.lastIndex) {
        map[nums[i]] = map.getValue(nums[i]) + 1
    }
    return map.entries.first { it.value == 1 }.key
}

// optimal - TC - O(n) and SC - O(n)
fun singleNumberXor(nums: IntArray): Int {
    var result = 0
    for (i in nums) {
        result = result xor i
    }
    return result
}