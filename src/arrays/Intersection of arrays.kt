package arrays

fun main() {
    val num1 = intArrayOf(1, 2, 2, 3, 4, 5, 5)
    val num2 = intArrayOf(1, 3, 3, 4, 5, 5, 7)
    intersectionOptimal(num1, num2)
}

// Brute TC - O(n^2)
private fun intersectionBrute(num1: IntArray, num2: IntArray) {
    val ins = mutableListOf<Int>()
    val temp = MutableList<Int>(num2.size) { 0 }
    for (i in num1) {
        for (j in num2) {
            if (num1[i] == num2[j] && temp[j] == 0) {
                ins.add(num1[i])
                temp[j] = 1
                break
            }
            if (num2[j] > num1[i]) break

        }
    }
    println(ins)
}

// optimal using 2 pointer TC - O(n), SC - (1)

private fun intersectionOptimal(num1: IntArray, num2: IntArray) {
    var i = 0
    var j = 0
    val ins = mutableListOf<Int>()
    val n1 = num1.lastIndex
    val n2 = num2.lastIndex

    while (i <= n1 && j <= n2) {
        if (num1[i] < num2[j]) i++
        else if (num2[j] < num1[i]) j++
        else {
            ins.add(num1[i])
            i++
            j++
        }
    }

    println(ins)
}
