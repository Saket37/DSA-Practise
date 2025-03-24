package basics.recursion

fun main() {
    readInputForPrintName()
}

private fun readInputForPrintName() {
    print("Enter a number for which you want to print the names: ")
    val num = readln().toInt()
    printName(1, num)
}

private fun printName(i: Int, n: Int) {
    if (i > n) return
    println("Saket")
    printName(i + 1, n)
}
