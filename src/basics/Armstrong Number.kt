package basics

fun main() {
    var num = 123
    val k = num.toString().length
    var sum = 0
    while (num > 0) {
        val lastDigit = num % 10
        sum += Math.pow(lastDigit.toDouble(), k.toDouble()).toInt()
        num /= 10
    }
    println(sum)
}