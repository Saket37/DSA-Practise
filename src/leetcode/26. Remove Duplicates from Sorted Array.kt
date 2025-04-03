package leetcode

fun main() {
    val nums = mutableListOf(1, 1, 2)

    var k = 0;
    for (i in 1..<nums.size) {
        if (nums[i] != nums[k]) {
            nums[k + 1] = nums[i]
            k++
        }
    }
    println(k + 1)
}