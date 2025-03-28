package leetcode


fun main() {
    val a = "man, a plan, a canal: Panama"
    val newString = a.filter { it.isLetterOrDigit() }.lowercase().trim()
    println(newString)
    println(isPalindrome(0,newString))
}



fun isPalindrome(i: Int, s: String) : Boolean{
    if (i >= (s.length) / 2) {
        return true
    }
    if (s[i] != s[s.length - i - 1]) {
        return false
    }
    return isPalindrome(i + 1, s)
}
