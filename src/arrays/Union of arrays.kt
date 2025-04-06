package arrays

fun main() {
    val num1 = intArrayOf(1, 2, 3, 4, 5, 9)
    val num2 = intArrayOf(1, 2, 4, 5, 6, 7, 11)

    //unionBrute(num1, num2)

    println(unionOptimal(num1, num2).toList())

}

// brute force - TC - )(n log n)
fun unionBrute(num1: IntArray, num2: IntArray) {
    val temp = mutableSetOf<Int>()
    for (i in num1) {
        temp.add(i)
    }
    for (i in num2) {
        temp.add(i)
    }
    println(temp)
}

// TC - O(n)
private fun unionOptimal(num1: IntArray, num2: IntArray): IntArray {
    var j = 0
    var i = 0
    val n1 = num1.lastIndex
    val n2 = num2.lastIndex
    val union = mutableListOf<Int>()

    while (n1 >= i && n2 >= j) {
        if (num1[i] <= num2[j]) {
            if (union.size == 0 || union.last() != num1[i]) {
                union.add(num1[i])
            }
            i++
        } else {
            if (union.size == 0 || union.last() != num2[j]) {
                union.add(num2[j])
            }
            j++
        }
    }
    while (i <= n1) {
        union.add(num1[i])
        i++
    }
    while (j <= n2) {
        union.add(num2[j])
        j++
    }
    return union.toIntArray()

}