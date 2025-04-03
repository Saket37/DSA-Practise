package arrays

fun main() {
    val l = mutableListOf(3, 4, 5, 1, 2)
    rotate(l)
    println(isSorted(l))
}

private fun rotate(arr: MutableList<Int>) {
    val temp = arr[0]
    for (i in 1..arr.lastIndex) {
        arr[i - 1] = arr[i]
    }
    arr[arr.lastIndex] = temp
}

private fun isSorted(arr: MutableList<Int>): Boolean {

    if (arr.size <= 1) {
        return true
    }
    for (i in 1..arr.lastIndex) {
        if (arr[i] < arr[i - 1]) {
            return false
        }
    }

    return true

}

