//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name : IntArray = intArrayOf(1,2,3,4,5,6,7)
    println(name.indices)
    rotate(name,3)
}
fun rotate(nums: IntArray, k: Int): Unit {
    val m= nums.toMutableList()
    val kList = m.takeLast(k)

    println(kList)
    m.subList(nums.size - k, nums.size).clear()
    println(m)
    m.addAll(0,kList)

    println(m)
}