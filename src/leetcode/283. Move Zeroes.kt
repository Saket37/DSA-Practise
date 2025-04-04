package leetcode

fun main() {
    val arr = intArrayOf(0, 1, 0, 3, 12)
    moveZeroesOptimal(arr)
    println(arr.toList())
}

// brute force

fun moveZeroesBrute(array: IntArray) {
    val temp = mutableListOf<Int>()
    var zeroCount = 0
    for (i in 0..array.lastIndex) {
        if (array[i] != 0) {
            temp.add(array[i])
        } else {
            zeroCount++
        }
    }
    repeat(zeroCount) {
        temp.add(0)
    }
    for (i in 0..array.lastIndex) {
        array[i] = temp[i]
    }
}

// optimal
fun moveZeroesOptimal(array: IntArray) {
    var j = -1
    for (i in 0..array.lastIndex) {
        if (array[i] == 0) {
            j = i
            break
        }
    }
    for (i in j + 1..array.lastIndex) {
        if (array[i] != 0) {
            val temp = array[j]
            array[j] = array[i]
            array[i] = temp
            j++
        }
    }
}
