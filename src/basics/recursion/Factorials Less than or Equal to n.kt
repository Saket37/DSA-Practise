package basics.recursion

/**
 * Problem Statement
 * A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Link - https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%5B%5D=-1&page=1&query=problemTypefunctionaldifficulty%5B%5D-1page1
 **/

fun main() {
    val n = readln().toLong()

    printFact(n)

}

private fun printFact(n: Long) {
    var f: Long = 1
    var x: Long = 2
    while (f <= n) {
        print("$f ")
        f *= x
        x++
    }
}