class Solution {
    private val day: Array<String> = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
    private val month: IntArray = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    fun solution(a: Int, b: Int): String = day[(month.sliceArray(0 until a - 1).sum() + b) % 7]
}

fun main() {
    val testCase: IntArray = intArrayOf(5, 24)

    println(Solution().solution(testCase[0], testCase[1]))
}
