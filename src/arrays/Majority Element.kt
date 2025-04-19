package arrays

fun main() {

}

//Brute
private fun brute(nums: IntArray): Int {
    for (i in 0..nums.lastIndex) {
        var count = 0
        for (j in 0..nums.lastIndex) {
            if (nums[i] == nums[j]) count++
        }
        if (count > nums.size / 2) return nums[i]
    }
    return -1
}

// better
private fun better(nums: IntArray): Int {
    val mpp = mutableMapOf<Int, Int>()
    for (i in 0..nums.lastIndex) {
        val newCount = mpp.getOrDefault(nums[i], 0) + 1
        mpp[nums[i]] = newCount
        if (newCount > nums.size / 2) return nums[i]
    }
    return -1
}

// TC - O(n log n), SC - O(1)
private fun sorting(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size / 2]
}

// optimal - Moore's Voting Algo
private fun algo(nums: IntArray): Int {
    var count = 0
    var el = 0
    for (i in 0..nums.lastIndex) {
        if (count == 0) {
            count = 1
            el = nums[i]
        } else if (nums[i] == el) {
            count++
        } else count--
    }
//    var cnt = 0
//    for (i in 0..nums.lastIndex) {
//        if (nums[i] == el) cnt++
//    }
//    if (cnt > nums.size / 2) return el
//    return -1

    return el
}