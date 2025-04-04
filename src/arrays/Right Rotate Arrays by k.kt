package arrays

fun main() {
    val l = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    //rightRotate(l, 3)
    rotateRightOptimal(l, 2)
    println(l.toList())
}
// brute
private fun rightRotate(arr: List<Int>, k: Int) {
    val mList = arr.toMutableList()
    val temp = arr.takeLast(k)
    println(temp)
    for (i in 0..arr.lastIndex - k) {
        mList[i + k] = arr[i]
    }
    for (i in 0..<k) {
        mList[i] = temp[i]
    }
    println(mList)
}
// optimal
private fun rotateRightOptimal(arr: IntArray, k: Int) {
    reverse(arr, 0, arr.lastIndex - k)
    reverse(arr, arr.lastIndex - k + 1, arr.lastIndex)
    reverse(arr, 0, arr.lastIndex)
}

private fun reverse(arr: IntArray, start: Int, end: Int) {
    if (start > end) return
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    reverse(arr, start + 1, end - 1)

}