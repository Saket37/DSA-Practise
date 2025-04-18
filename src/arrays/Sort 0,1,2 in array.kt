package arrays

fun main() {

}
// Brute - use sorting algo

// better - count the 0s,1s and 2s. replace the list with count of the nos.

// optimal - using 3 pointer (Dutch National Flag algorithm (DNF))
private fun optimal(nums: IntArray) {
    var low = 0
    var mid = 0
    var high = nums.lastIndex
    while (mid <= high) {
        if (nums[mid] == 0) {
            val temp = nums[low]
            nums[low] = nums[mid]
            nums[mid] = temp
            low++
            mid++
        } else if (nums[mid] == 1){
            mid++
        } else {
            val temp = nums[mid]
            nums[mid] = nums[high]
            nums[high] = temp
            high--
        }
    }
}


