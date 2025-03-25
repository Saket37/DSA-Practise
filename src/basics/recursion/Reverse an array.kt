package basics.recursion

fun main() {
    val number = readlnOrNull()
        ?.split(" ")
        ?.map { it.toInt() }
        ?.toMutableList() ?: mutableListOf()

    rev(0, number, number.size - 1)

    println(number)
}

private fun rev(i: Int, listOfNum: MutableList<Int>, n: Int) {
    if (i >= n) return
    val temp = listOfNum[i]
    listOfNum[i] = listOfNum[n]
    listOfNum[n] = temp

    rev(i + 1, listOfNum, n - 1)
}