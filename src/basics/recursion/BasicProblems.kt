package basics.recursion

fun main() {
    //readInputForPrintName()
    readInputToPrintFromTo1()
}

// print sum of n numbers
private fun sumOfN(i: Int, sum: Int) {
    if (i < 1) {
        println(sum)
        return
    }
    sumOfN(i - 1, sum + i)

}
// another method for sum on n numbers using functional recursion
private fun sumOfN(n: Int) : Int{
    if (n == 0) return 0
    return n + sumOfN(n-1)
}

// print from n to 1
private fun readInputToPrintFromTo1() {
    print("Enter a number for which you want to calculate the sum: ")
    val num = readln().toInt()
    //printNumbers(num, 1)
    println(sumOfN(num))
}

private fun printNumbers(n: Int, i: Int) {
    if (n < 1) return
    printNumbers(n - 1, i)
    println(n)
}

// or we can do it like this
private fun printNumber(i: Int, n: Int) {
    if (i < 1) return
    println(i)
    printNumber(i - 1, n)

}


private fun readInputForPrintName() {
    print("Enter a number for which you want to print the names: ")
    val num = readln().toInt()
    printName(1, num)
}

private fun printName(i: Int, n: Int) {
    if (i > n) return
    printName(i + 1, n)
    println("Saket")

}
