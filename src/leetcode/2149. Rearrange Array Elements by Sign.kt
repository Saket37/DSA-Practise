package leetcode

fun main() {
    val nums = intArrayOf(3, 1, -2, -5, 2, -4)
}

private fun brute(nums: IntArray) {
    /** create 2 arrays. pos and neg
     * add the elements to respective arrays
     * update the arrays by picking 1 from each
     **/
}

private fun optimal(nums: IntArray) {
    val newArr = IntArray(nums.size)

    var posIndex = 0
    var negIndex = 1

    for (i in 0..nums.lastIndex) {
        if (nums[i] < 0) {
            newArr[negIndex] = nums[i]
            negIndex += 2
        } else {
            newArr[posIndex] = nums[i]
            posIndex += 2
        }
    }
}

// Another sol, if +ve != -ve, same as brute but with additional checks
private fun sol(nums: IntArray) {
    val pos = mutableListOf<Int>()
    val neg = mutableListOf<Int>()

    for (i in 0..nums.lastIndex) {
        if (nums[i] > 0) {
            pos.add(nums[i])
        } else neg.add(nums[i])
    }

    if (pos.size > neg.size) {
        for (i in 0..neg.size) {
            nums[2 * i] = pos[i]
            nums[2 * (i + 1)] = neg[i]
        }
        var index = neg.size * 2
        for (i in neg.size..<pos.size) {
            nums[index] = pos[i]
            index++
        }
    } else {
        for (i in 0..pos.size) {
            nums[2 * i] = pos[i]
            nums[2 * (i + 1)] = neg[i]
        }
        var index = pos.size * 2
        for (i in pos.size..<neg.size) {
            nums[index] = neg[i]
            index++
        }
    }
}