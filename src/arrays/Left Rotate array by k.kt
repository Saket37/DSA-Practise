package arrays


fun main() {
    val l = mutableListOf(6, 10, 6)
    rotateList(l,2)
    println(l)
}

private fun rotate(arr: MutableList<Int>, rotation: Int) {
    val temp = arr.take(rotation)
    for (i in rotation..arr.lastIndex) {
        arr[i - rotation] = arr[i]
    }
    repeat(rotation) { arr.removeAt(arr.lastIndex) }
    arr.addAll(temp)

    // can iterate and swap the elements of array for better TC
}

// optimal approach

private fun rotateList(arr: MutableList<Int>, rotation: Int) {
    reverse(arr, 0, rotation -1)
    reverse(arr, rotation, arr.lastIndex)
    reverse(arr, 0 , arr.lastIndex)
}

private fun reverse(arr: MutableList<Int>, start: Int, end: Int) {
    if (start > end) return
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    reverse(arr, start + 1, end - 1)

}


