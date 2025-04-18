package arrays

fun main() {
    val l = mutableListOf(44, 25, 34, 24, 6, 47, 4)
    println(secondLargestOptimal(l))
}

// brute force - sort the array and find from last

// better
fun secondLargest(arr: List<Int>): Int {

    var largest = arr[0]
    var secondLargest = -1

    for (i in 1..arr.lastIndex) {
        if (arr[i] > largest) {
            largest = arr[i]
        }
    }

    for (i in 0..arr.lastIndex) {
        if (arr[i] in (secondLargest + 1)..<largest)
            secondLargest = arr[i]
    }
    return secondLargest
}

// optimal
fun secondLargestOptimal(arr: List<Int>): Int {
    var largest = arr[0]
    var secondLargest = -1

    for (i in 1..arr.lastIndex) {
        if (arr[i] > largest) {
            secondLargest = largest
            largest = arr[i]
        } else if (arr[i] < largest && arr[i] > secondLargest)
            secondLargest = arr[i]
    }
    return secondLargest
}